package javastreams.filterstreams;

import java.io.*;

public class ConvertUppercaseToLowercase {
    public static void convertUppercaseToLowercase(String inputFile, String outputFile) {

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toLowerCase());
                writer.newLine();
            }

            System.out.println("File conversion completed. Uppercase letters converted to lowercase.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

