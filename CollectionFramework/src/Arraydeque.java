import java.util.ArrayDeque;
import java.util.Queue;

public class Arraydeque {
    Queue<String> arraydeque=new ArrayDeque<>();

    public void addToArrayDeque(String value){
        arraydeque.add(value);
    }

    public void removeFromArrayDeque(String value){
        arraydeque.remove(value);
    }

    public void getArrayDeque(){
        System.out.println(arraydeque);
    }
}
