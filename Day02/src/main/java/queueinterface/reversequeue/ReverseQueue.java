package queueinterface.reversequeue;

import java.util.Queue;

public class ReverseQueue {
     public static <T> Queue<T> reverseQueue(Queue <T> queue){
         if (queue.isEmpty()) {
             return queue;
         }
         T front = queue.poll();
        reverseQueue(queue);
         queue.add(front);


return  queue;
     }
}
