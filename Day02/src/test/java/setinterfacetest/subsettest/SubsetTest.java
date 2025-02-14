package setinterfacetest.subsettest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import setinterface.subset.Subset;

import java.util.HashSet;
import java.util.Set;

public class SubsetTest {
    @Test
    void subsetTest(){
        Set<Integer> set1 = new HashSet<>(Set.of(2,3));
        Set <Integer> set2 = new HashSet<>(Set.of(1,2,3,4));

        assertEquals(true , Subset.subSet(set1,set2));
    }
}
