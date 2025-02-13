package setinterface.comparetwosets;

import java.util.Set;

public class SetsChecker {
    public static <T> boolean setCompare(Set <T> set1 , Set <T> set2){
        if(set1 == null || set2 == null){
            return false;
        }
        if(set1.size() != set2.size()){
            return false;
        }
        for (T elem : set1 ) {
            if(!set2.contains(elem)){
                return  false;
            }
        }
        return true;
    }
}
