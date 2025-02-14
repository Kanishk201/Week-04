package mapinterfacetest.keywithhighestvaluetest;
import mapinterface.keywithhighestvalue.KeyWithHighestValue;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class KeyWithhighestValueTest {
    @Test
    void keyWithHighestValueTest(){
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 15);

        assertEquals("B", KeyWithHighestValue.keyWithHighestValue(map));
    }
}
