import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist extends ArrayList {

    List<Integer> list = new ArrayList<>();


    public void addNumbersToList(int i) {
            list.add(i);
        System.out.println(list.toString());

    }

    public void removeFromList(int value){
            list.remove(value);
            list.remove(value);
        }


    public void getFromIndex(int index) {
        System.out.println( list.get(index));


    }

    public void getArrayList(){
        System.out.println(list);
    }





}

