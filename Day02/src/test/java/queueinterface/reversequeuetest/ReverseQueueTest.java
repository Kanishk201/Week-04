package queueinterface.reversequeuetest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import queueinterface.reversequeue.ReverseQueue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueueTest {
    @Test
    void reverseTest(){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        Queue<Integer> expected = new LinkedList<>(Arrays.asList(30,20,10));
        assertEquals(expected , ReverseQueue.reverseQueue(queue));
    }

}
