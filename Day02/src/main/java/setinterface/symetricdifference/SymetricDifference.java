package setinterface.symetricdifference;

import java.util.HashSet;
import java.util.Set;

public class SymetricDifference {
    public static <T> Set<T> symetricDifference(Set <T> set1 , Set <T> set2){

        Set<T> resultset = new HashSet<>(set1);
        for(T elem : set2){
            resultset.add(elem);
        }

        Set<T> intersectionSet = new HashSet<>(set1);
       for (T elem : set1){
           if(!set2.contains(elem)){
               intersectionSet.remove(elem);
           }
       }

      for(T elem : intersectionSet){
          resultset.remove(elem);
      }



    return resultset;
    }
}
