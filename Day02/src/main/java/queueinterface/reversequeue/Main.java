package queueinterface.reversequeue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue <Integer> queue = new LinkedList<>();


        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        ReverseQueue.reverseQueue(queue);

        System.out.println("Reversed Queue : ");
        while(!queue.isEmpty()){
            System.out.print(queue.poll()+" ");
        }
    }
}
