package listinterfacetest.nthelementtest;

//Testing
import static org.junit.jupiter.api.Assertions.*;

import listinterface.nthelement.NthElement;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class NthElementTest {

    @Test
    void nthElementTest(){
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        assertEquals("D", NthElement.nthElement(list,2));
    }
}
