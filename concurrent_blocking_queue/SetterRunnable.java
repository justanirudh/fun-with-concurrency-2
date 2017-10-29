package concurrent_blocking_queue;

/**
 * Created by paanir on 10/28/17.
 */
public class SetterRunnable implements Runnable {

    CBQueue q;
    int num;

    public SetterRunnable(CBQueue q, int num) {
        this.q = q;
        this.num = num;
    }

    public void run() {
        try {
            Thread.sleep((long) (Math.random() * 100));
            q.put(num);
            System.out.println("Put num: " + num);
        } catch (InterruptedException ex) {

        }
    }

}
