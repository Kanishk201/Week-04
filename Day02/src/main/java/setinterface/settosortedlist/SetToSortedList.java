package setinterface.settosortedlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SetToSortedList {

    public static List<Integer> sortSet(Set<Integer> set) {
        List<Integer> sortedList = new ArrayList<>(set);

        for (int i = 0; i < sortedList.size() - 1; i++) {
            for (int j = 0; j < sortedList.size() - i - 1; j++) {

                if (sortedList.get(j) > sortedList.get(j + 1)) {
                    int temp = sortedList.get(j);
                    sortedList.set(j, sortedList.get(j + 1));
                    sortedList.set(j + 1, temp);
                }
            }
        }

        return sortedList;

    }
}
