package mapinterface.mergetwomap;

import java.util.HashMap;
import java.util.Map;

public class MergeTwoMap {
    public static Map<String,Integer> mergeMap(Map<String,Integer> map1 ,Map<String,Integer> map2){
        Map<String,Integer> mergedMap = new HashMap<>();

        for(String key : map1.keySet()){
            mergedMap.put(key,map1.get(key));
        }

        for(String key : map2.keySet()){
          if(mergedMap.containsKey(key)){
              mergedMap.put(key,mergedMap.get(key)+map2.get(key));
          }
          else{  mergedMap.put(key,map2.get(key));
        }}
        return mergedMap;
    }
}
