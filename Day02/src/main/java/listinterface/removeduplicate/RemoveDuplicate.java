package listinterface.removeduplicate;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate {
    public static List<Integer> removeDuplicate(List <Integer> list){
        List <Integer> newList = new ArrayList<>();
        for(int item : list){
            if(! newList.contains(item)){
                newList.add(item);
            }
        }
        return newList;
    }

}
