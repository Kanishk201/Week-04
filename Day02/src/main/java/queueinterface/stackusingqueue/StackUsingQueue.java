package queueinterface.stackusingqueue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    Queue <Integer> queue1;
    Queue <Integer> queue2;

    public StackUsingQueue(){
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    //Push operation

    public void push(int data){
        queue1.offer(data);
    }


    //Pop operation

    public int pop(){
        if (queue1.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        while(queue1.size() > 1){
            queue2.offer(queue1.poll());
        }
        int popped = queue1.poll();

        //swap back the queues
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return popped;
    }

    //peek operation
    public int peek(){
        if (queue1.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        while(queue1.size() > 1){
            queue2.offer(queue1.poll());
        }
        int peeked = queue1.poll();
        queue2.offer(peeked);

        //swap back the queues
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return peeked;
    }
    // Check if stack is empty
    public boolean isEmpty() {
        return queue1.isEmpty();
    }
}
