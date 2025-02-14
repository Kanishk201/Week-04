package queueinterface.circularbuffertest;

import org.junit.jupiter.api.Test;
import queueinterface.circularbuffer.CircularBuffer;

import static org.junit.jupiter.api.Assertions.*;

class CircularBufferTest {
    @Test
    void testInsertAndOverwrite() {
        CircularBuffer cb = new CircularBuffer(3);
        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        assertArrayEquals(new int[]{1, 2, 3}, cb.getBufferContents());

        cb.insert(4); // Overwrites oldest (1)
        assertArrayEquals(new int[]{2, 3, 4}, cb.getBufferContents());
    }

}