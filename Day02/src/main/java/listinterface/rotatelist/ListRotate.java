package listinterface.rotatelist;

import java.util.ArrayList;
import java.util.List;

public class ListRotate {
    public static <T> List<T> rotateList(List<T> list, int positions){

        int size = list.size();
        positions = positions % size;

        List <T> rotatedList = new ArrayList<>(list.subList(positions,size));
        rotatedList.addAll(list.subList(0,positions));

        return rotatedList;
    }
}
