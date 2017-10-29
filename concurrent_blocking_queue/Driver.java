package concurrent_blocking_queue;

/**
 * Created by paanir on 10/28/17.
 */
public class Driver {
    public static void main(String[] args) {

        int numGetters = 10;
        int numPutters = 10;
        //test: 0 get 11 put, 10 get, 0 put

        CBQueue queue = new CBQueue(10);

        for (int i = 0; i < numGetters || i < numPutters; ++i) {
            if (i < numGetters) {
                Runnable getter = new GetterRunnable(queue);
                Thread t = new Thread(getter);
                t.start();
            }
            if (i < numPutters) {
                Runnable putter = new SetterRunnable(queue, i);
                Thread t = new Thread(putter);
                t.start();

            }
        }
    }
}
