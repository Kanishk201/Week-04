//package mapinterfacetest.wordfrequencytest;
//
//import mapinterface.wordfrequencycounter.WordFrequencyCounter;
//import org.junit.jupiter.api.Test;
//import java.io.*;
//import java.util.*;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class WordFrequencycounterTest {
//
//    @Test
//    void testWordFrequency() throws IOException {
//
//
//        File tempFile = File.createTempFile("test", ".txt");
//        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
//        writer.write("Hello world, hello Java!");
//        writer.close();
//
//
//        Map<String, Integer> expected = new HashMap<>();
//        expected.put("hello", 2);
//        expected.put("world", 1);
//        expected.put("java", 1);
//
//   ]
//        Map<String, Integer> result = WordFrequencyCounter.wordFrequencyCounter(tempFile.getAbsolutePath());
//        assertEquals(expected, result);
//
//
//        tempFile.delete();
//    }
//}
