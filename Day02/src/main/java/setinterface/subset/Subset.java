package setinterface.subset;

import java.util.Set;

public class Subset {
    public static <T> boolean subSet(Set <T> set1 , Set <T> set2){
        for (T elem : set1){
            if(!set2.contains(elem)){
                return false;
            }
        }
        return true;
    }
}
