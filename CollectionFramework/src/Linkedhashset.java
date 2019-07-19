import java.util.LinkedHashSet;
import java.util.Set;

public class Linkedhashset {
    Set<String> linkedhashset=new LinkedHashSet<>();

    public void addToLinkedHashset(String value){
        linkedhashset.add(value);
    }

    public void removeFromLinkedHashset(String value){
        linkedhashset.remove(value);
    }

    public void getLinkedhashset(){
        System.out.println(linkedhashset);
    }
}
