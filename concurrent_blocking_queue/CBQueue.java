package concurrent_blocking_queue;

/**
 * Created by paanir on 10/28/17.
 */
public class CBQueue {

    private int size;
    private int[] arr;
    private int in, out, numElems;

    public CBQueue(int size) {
        this.size = size;
        arr = new int[size];
        in = out = numElems = 0;
    }

    public synchronized void put(int item) throws InterruptedException {
        while (numElems == size){
            System.out.println("waiting since full");
            wait();
        }
        arr[in] = item;
        in = (in + 1) % size;
        numElems++;
        notifyAll();
    }


    public synchronized int get() throws InterruptedException {
        while (numElems == 0){
            System.out.println("waiting since empty");
            wait();
        }
        int item = arr[out];
        out = (out + 1) % size;
        numElems--;
        notifyAll();
        return item;
    }

}
