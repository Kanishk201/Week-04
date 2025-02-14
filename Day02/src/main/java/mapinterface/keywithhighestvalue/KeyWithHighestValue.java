package mapinterface.keywithhighestvalue;

import java.util.Map;

public class KeyWithHighestValue {
    public static String keyWithHighestValue ( Map<String,Integer> map){
        String maxkey = null;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<String,Integer> entry: map.entrySet()){
            if(entry.getValue() > maxValue){
                maxkey= entry.getKey();
                maxValue = entry.getValue();

            }
        }
        return maxkey;
    }
}
