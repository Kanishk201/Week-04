package mapinterfacetest.mergetwomaptest;
import static org.junit.jupiter.api.Assertions.*;

import mapinterface.mergetwomap.MergeTwoMap;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class MergeTwoMapTest {
    @Test
    void mergeTwoMaptest(){
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        Map<String, Integer> expected = new HashMap<>();
        expected.put("A",1);
        expected.put("B",5);
        expected.put("C",4);

        assertEquals(expected, MergeTwoMap.mergeMap(map1,map2));

    }
}
