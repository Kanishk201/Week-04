package setinterface.unionandintersection;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Set.of(1,2,3));
        Set<Integer> set2 = new HashSet<>(Set.of(3,4,5));

        System.out.println("Union Set :"+UnionAndIntersection.union(set1,set2));
        System.out.println("Intersection Set :"+UnionAndIntersection.intersection(set1,set2));
    }
}
