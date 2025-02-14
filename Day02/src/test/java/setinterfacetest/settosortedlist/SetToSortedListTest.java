package setinterfacetest.settosortedlist;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import setinterface.settosortedlist.SetToSortedList;

import java.util.*;

public class SetToSortedListTest {
    @Test
    void setToSortedTest(){
        Set<Integer> set = new HashSet<>(Set.of(5, 3, 9, 1));
        List<Integer> expected = Arrays.asList(1,3,5,9);

        assertEquals(expected, SetToSortedList.sortSet(set));
    }
}
