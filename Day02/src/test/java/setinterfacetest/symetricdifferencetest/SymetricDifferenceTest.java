package setinterfacetest.symetricdifferencetest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import setinterface.symetricdifference.SymetricDifference;

import java.util.HashSet;
import java.util.Set;

public class SymetricDifferenceTest{
    @Test
    void symetricDifferenceTest(){
        Set<Integer> set1 = new HashSet<>(Set.of(1,2,3));
        Set<Integer> set2 = new HashSet<>(Set.of(3,4,5));
        Set<Integer> expected = new HashSet<>(Set.of(1,2,4,5));

        assertEquals(expected , SymetricDifference.symetricDifference(set1 , set2));


    }

}
