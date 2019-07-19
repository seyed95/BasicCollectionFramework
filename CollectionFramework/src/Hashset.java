import java.util.HashSet;
import java.util.Set;

public class Hashset {
    Set<String> hashset=new HashSet<String>();

    public void addtoHashset(String value){
        hashset.add(value);
    }
    public void removeFromHashset(String value){
        hashset.remove(value);
    }

    public void getHashset(){
        System.out.println(hashset);

    }
    
}
