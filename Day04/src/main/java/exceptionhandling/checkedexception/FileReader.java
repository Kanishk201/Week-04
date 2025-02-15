package exceptionhandling.checkedexception;

import java.io.*;

public class FileReader {
    public static void fileReader(String fileName) {
        String str = "";

        try(BufferedReader reader = new BufferedReader(new java.io.FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                str = line;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found " + e.getMessage());
        } catch (IOException e){
            System.out.println("An error occured while reading the file");
        }
    }
}
