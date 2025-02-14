package queueinterface.stackusingqueue;

public class Main {
    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);


        System.out.println(stack.pop());
    }
}
