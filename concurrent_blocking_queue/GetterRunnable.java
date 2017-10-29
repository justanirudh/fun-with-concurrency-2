package concurrent_blocking_queue;

/**
 * Created by paanir on 10/28/17.
 */
public class GetterRunnable implements Runnable{

    CBQueue q;

    public GetterRunnable(CBQueue q){
        this.q = q;
    }

    public void run(){
        try{
            Thread.sleep((long)(Math.random() * 100));
            int num = q.get();
            System.out.println("Got num: " + num);
        } catch (InterruptedException ex){

        }
    }
}
