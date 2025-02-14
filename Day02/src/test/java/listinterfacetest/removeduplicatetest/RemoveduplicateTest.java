package listinterfacetest.removeduplicatetest;


import static org.junit.jupiter.api.Assertions.*;

import listinterface.removeduplicate.RemoveDuplicate;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


public class RemoveduplicateTest {
    @Test
    void removeDuplicateTest(){
        List<Integer> list = Arrays.asList(3, 1, 2, 2, 3, 4);
        List<Integer> expected = Arrays.asList(3, 1, 2, 4);
        assertEquals(expected , RemoveDuplicate.removeDuplicate(list));
    }
}
