package junittesting.basiicjunittesting.listoperationstest;

import static org.junit.jupiter.api.Assertions.*;

import junitproblems.basicjunitproblems.listoperations.ListManager;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;


public class ListManagerTest {
    private final ListManager listManager = new ListManager();

    @Test
    void testAddElement() {
        List<Integer> list = new ArrayList<>();
        listManager.addElement(list, 10);
        listManager.addElement(list, 20);

        assertEquals(2, list.size());
        assertTrue(list.contains(10));
        assertTrue(list.contains(20));
    }

    @Test
    void testRemoveElement() {
        List<Integer> list = new ArrayList<>();
        listManager.addElement(list, 10);
        listManager.addElement(list, 20);
        listManager.removeElement(list, 10);

        assertEquals(1, list.size());
        assertFalse(list.contains(10));
        assertTrue(list.contains(20));
    }

    @Test
    void testRemoveNonExistentElement() {
        List<Integer> list = new ArrayList<>();
        listManager.addElement(list, 10);
        listManager.removeElement(list, 30); // Trying to remove an element that doesn't exist

        assertEquals(1, list.size()); // Size should remain unchanged
        assertTrue(list.contains(10));
    }

    @Test
    void testGetSize() {
        List<Integer> list = new ArrayList<>();
        assertEquals(0, listManager.getSize(list));

        listManager.addElement(list, 10);
        assertEquals(1, listManager.getSize(list));

        listManager.addElement(list, 20);
        assertEquals(2, listManager.getSize(list));

        listManager.removeElement(list, 10);
        assertEquals(1, listManager.getSize(list));
    }

    @Test
    void testNullList() {
        assertEquals(0, listManager.getSize(null));

        listManager.addElement(null, 10); // Should not throw an error
        listManager.removeElement(null, 10); // Should not throw an error
    }
}

