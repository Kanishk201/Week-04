package listinterfacetest.reverselisttest;

import static org.junit.jupiter.api.Assertions.*;

import listinterface.reverselist.ListReverse;
import org.junit.jupiter.api.Test;


import java.util.*;

public class reverseListTest {
    @Test
    void reverseArrayListTest(){
        List <Integer> input = Arrays.asList(1,2,3,4,5);
        List <Integer> expected = Arrays.asList(5,4,3,2,1);

        assertEquals(expected , ListReverse.reverseList(input));
    }

}