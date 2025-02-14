package queueinterface.circularbuffer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);
        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        System.out.println("Buffer contents: " + Arrays.toString(cb.getBufferContents()));

        cb.insert(4);
        System.out.println("After inserting 4: " + Arrays.toString(cb.getBufferContents()));
    }
}