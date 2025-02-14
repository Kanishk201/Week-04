package queueinterface.stackusingqueuetest;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
import queueinterface.stackusingqueue.StackUsingQueue;

public class StackUsingQueueTest {
    @Test
    void stackUsingQueueTest(){
        StackUsingQueue stack = new StackUsingQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3,stack.pop());
    }
}
