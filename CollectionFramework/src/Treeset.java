import java.util.Set;
import java.util.TreeSet;

public class Treeset {
    Set<String> treeset=new TreeSet<>();

    public void addToTreeset(String value){
        treeset.add(value);
    }

    public void removeFromTreeset(String value){
        treeset.remove(value);
    }

    public void getTreeset(){
        System.out.println(treeset);
    }
}
