package expandablearray;

import java.util.ArrayList;

import static expandablearray.Client.array;
import static expandablearray.ClientBlockingQueue.queue;

/**
 * Created by anirudh on 27/9/16.
 */
public class UseExpandableArrayRunnable implements Runnable{

    public ExpandableArray arr;

    public void initializeArrayfromQueue() throws InterruptedException{
        arr = queue.take();
    }

//    @Override //Using direct static array (from Client)
//    public void run(){
//        array.add("69");
//        array.add(44);
//        array.removeLast();
//        array.add(new ArrayList<Integer>(20).add(10));
//    }

    @Override //Using passing via Blocking Queue (via ClientBlockingQueue)
    public void run(){
        try {
            initializeArrayfromQueue();
        } catch(InterruptedException e){

        }
        arr.add("69");
        arr.add(44);
        arr.add(new ArrayList<Integer>(20).add(10));
    }
}
