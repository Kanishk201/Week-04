package listinterfacetest.rotatelisttest;

import listinterface.rotatelist.ListRotate;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RotateListTest {
    @Test
    void rotateTest(){
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> expected = Arrays.asList(30, 40, 50, 10, 20);
        assertEquals(expected, ListRotate.rotateList(list,2));
    }
}
