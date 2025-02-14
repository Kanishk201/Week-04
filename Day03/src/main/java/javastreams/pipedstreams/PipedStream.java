package javastreams.pipedstreams;

import java.io.*;

public class PipedStream {
    public static void main(String[] args) {
        try {
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos);

            Thread writer = new WriterThread(pos);
            Thread reader = new ReaderThread(pis);

            writer.start();
            reader.start();
        } catch (IOException e) {
            System.out.println("Error setting up piped streams: " + e.getMessage());
        }
    }
}
