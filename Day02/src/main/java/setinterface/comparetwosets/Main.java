package setinterface.comparetwosets;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set <Integer> set1 = new HashSet<>(Set.of(1,2,3));
        Set <Integer> set2 = new HashSet<>(Set.of(3,2,1));

        System.out.println("Is Sets Are Equal ?  "+SetsChecker.setCompare(set1,set2));
    }
}
