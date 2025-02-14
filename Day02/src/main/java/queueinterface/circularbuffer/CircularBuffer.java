package queueinterface.circularbuffer;

import java.util.Arrays;

public class CircularBuffer {
    private int[] buffer;
    private int head;
    private int tail;
    private int size;
    private int capacity;

    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        this.buffer = new int[capacity];
        this.head = 0;
        this.tail = 0;
        this.size = 0;
    }

    public void insert(int value) {
        buffer[tail] = value;
        tail = (tail + 1) % capacity;
        if (size < capacity) {
            size++;
        } else {
            head = (head + 1) % capacity; // Overwrite oldest element
        }
    }

    public int[] getBufferContents() {
        int[] contents = new int[size];
        for (int i = 0; i < size; i++) {
            contents[i] = buffer[(head + i) % capacity];
        }
        return contents;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}