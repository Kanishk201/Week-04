package javastreams.bufferedstreams;

public class EfficientFileCopyMain {
    public static void main(String[] args) {
        String sourceFile = "largefile1.pdf";
        String buffereddest = "bufferedtext.pdf";
        String unbuffereddest = "unbufferedtext.pdf";

        long bufferedTime = EfficientFileCopy.copyWithBufferedStreams(sourceFile, buffereddest);
        System.out.println("Time taken with Buffered Streams: " + bufferedTime + " nanoseconds");

        long unbufferedTime = EfficientFileCopy.copyWithUnbufferedStreams(sourceFile, unbuffereddest);
        System.out.println("Time taken with Unbuffered Streams: " + unbufferedTime + " nanoseconds");
    }
}
