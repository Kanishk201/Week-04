package mapinterfacetest.invertmaptest;
import mapinterface.invertmap.InvertMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class InvertMapTest {

    @Test
    void testInvertMap() {
        Map<String, Integer> input = new HashMap<>();
        input.put("A", 1);
        input.put("B", 2);
        input.put("C", 1);

        Map<Integer, List<String>> expected = new HashMap<>();
        expected.put(1, Arrays.asList("A", "C"));
        expected.put(2, Collections.singletonList("B"));

        Map<Integer, List<String>> result = InvertMap.invertMap(input);

        assertEquals(expected.size(), result.size());
        assertTrue(result.containsKey(1));
        assertTrue(result.containsKey(2));
        assertEquals(new HashSet<>(expected.get(1)), new HashSet<>(result.get(1)));
        assertEquals(new HashSet<>(expected.get(2)), new HashSet<>(result.get(2)));
    }

}
