import java.util.Collection;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priorityqueue {

    Queue<String> queue=new PriorityQueue<>();

    public void addToQueue(String value){
        queue.add(value);
    }

    public void removeFromQueue(){
        queue.remove();
    }

    public void getQueue(){
        System.out.println(queue);
    }




}
