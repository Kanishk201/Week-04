package listinterfacetest.frequencyofelementtest;
import static org.junit.jupiter.api.Assertions.*;


import listinterface.frequencyofelement.FrequencyCount;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyCountTest {
    @Test
    void frequencyTest(){
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange");
        Map<String, Integer> expected = new HashMap<>();
        expected.put("apple", 2);
        expected.put("banana", 1);
        expected.put("orange", 1);
        assertEquals(expected, FrequencyCount.frequencyCount(list));

    }
}
