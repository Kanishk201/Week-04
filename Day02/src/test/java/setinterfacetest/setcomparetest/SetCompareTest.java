package setinterfacetest.setcomparetest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import setinterface.comparetwosets.SetsChecker;

import java.util.HashSet;
import java.util.Set;

public class SetCompareTest {
    @Test
    void setComparetest() {
        Set<Integer> set1 = new HashSet<>(Set.of(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Set.of(3, 2, 1));
        assertEquals(true, SetsChecker.setCompare(set1,set2));
    }
}
