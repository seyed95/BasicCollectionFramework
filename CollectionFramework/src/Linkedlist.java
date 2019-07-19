import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist {
    List<String> list=new LinkedList<>();
    Iterator <String>listIterator=list.iterator();

    public void addToLinkedList(String value){
        list.add(value);

    }

    public void removeFromLinkedList(String value){
        while(listIterator.hasNext()){
            String object=listIterator.next();
            if(object.equalsIgnoreCase(value)){
                list.remove(object);
            }

        }
    }

    public void getLinkedList(){
        System.out.println(list);
    }

}
