package javastreams.bufferedstreams;

import java.io.*;

public class EfficientFileCopy {
    public static long copyWithBufferedStreams(String source, String dest) {
        long startTime = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("Error copying with buffered streams: " + e.getMessage());
        }
        return System.nanoTime() - startTime;
    }

    public static long copyWithUnbufferedStreams(String source, String dest) {
        long startTime = System.nanoTime();
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(dest)) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("Error copying with unbuffered streams: " + e.getMessage());
        }
        return System.nanoTime() - startTime;
    }
}
