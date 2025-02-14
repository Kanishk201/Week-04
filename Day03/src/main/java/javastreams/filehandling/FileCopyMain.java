package javastreams.filehandling;

public class FileCopyMain {
    public static void main(String[] args) {
        String sourceFile = "source";
        String destinationFile = "destination";

        FileCopy.fileReadWrite(sourceFile, destinationFile);
    }
}
