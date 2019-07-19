import java.util.List;
import java.util.Vector;

public class vector {

    Vector<String> vector=new Vector<String>();

    public void addToVector(String value){
        vector.add(value);
    }

    public void removeFromVector(String value){
        vector.remove(value);
    }

    public void getVector(){
        System.out.println(vector);
    }
}
