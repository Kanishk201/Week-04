package setinterfacetest.unionandintersectiontest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import setinterface.unionandintersection.UnionAndIntersection;

import java.util.HashSet;
import java.util.Set;

public class UnionAndInterSectionTest {
    @Test
    void unionTest(){
        Set<Integer> set1 = new HashSet<>(Set.of(1,2,3));
        Set<Integer> set2 = new HashSet<>(Set.of(3,4,5));
        Set<Integer> expected = new HashSet<>(Set.of(1,2,3,4,5));

        assertEquals(expected, UnionAndIntersection.union(set1,set2));

    }
    @Test
    void intersectionTest(){

        Set<Integer> set1 = new HashSet<>(Set.of(1,2,3));
        Set<Integer> set2 = new HashSet<>(Set.of(3,4,5));
        Set<Integer> expected = new HashSet<>(Set.of(3));

        assertEquals(expected, UnionAndIntersection.intersection(set1,set2));

    }
}
