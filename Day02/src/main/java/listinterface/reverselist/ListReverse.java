package listinterface.reverselist;

import java.util.ArrayList;
import java.util.List;


    public class ListReverse {
        public static <T> List<T> reverseList(List<T> list){
            List<T> reverseList = new ArrayList<>();
            for(int i = list.size()-1; i>=0;i--){
                reverseList.add(list.get(i));
            }
            return  reverseList;
        }
    }


