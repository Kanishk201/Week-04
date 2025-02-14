package mapinterface.wordfrequencycounter;

import java.io.*;
import java.util.*;


public class WordFrequencyCounter {
    public static Map<String,Integer> wordFrequencyCounter(String filename) throws IOException {
        Map<String,Integer> wordMap = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;

        while((line = reader.readLine()) != null){
            String [] words = line.toLowerCase().split(" ");

            for(String word : words){
                wordMap.put(word,wordMap.getOrDefault(word,0)+1);
            }
        }

       reader.close();
      return wordMap;
    }
}
