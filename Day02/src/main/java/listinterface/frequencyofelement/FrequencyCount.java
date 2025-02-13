package listinterface.frequencyofelement;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyCount {
    public static Map<String , Integer> frequencyCount(List<String> list){
        Map<String , Integer> frequencyMap = new HashMap<>();

        for(String item : list){
            frequencyMap.put(item, frequencyMap.getOrDefault(item,0)+1);
        }
        return frequencyMap;
    }
}

