package setinterface.settosortedlist;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set <Integer> set = new HashSet<>(Set.of(5, 3, 9, 1));

        System.out.println("Sorted list : "+SetToSortedList.sortSet(set));
    }
}
