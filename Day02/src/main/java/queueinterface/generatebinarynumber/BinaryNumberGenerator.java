package queueinterface.generatebinarynumber;

import java.util.*;

public class BinaryNumberGenerator {
    public static List<String> generateBinaryNumbers(int N) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        if (N <= 0) {
            return result;
        }

        queue.offer("1");

        for (int i = 0; i < N; i++) {
            String current = queue.poll();
            result.add(current);

            queue.offer(current + "0");
            queue.offer(current + "1");
        }

        return result;
    }
}
