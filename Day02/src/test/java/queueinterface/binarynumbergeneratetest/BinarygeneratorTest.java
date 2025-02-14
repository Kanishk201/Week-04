package queueinterface.binarynumbergeneratetest;


import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import queueinterface.generatebinarynumber.BinaryNumberGenerator;

import java.util.Arrays;
import java.util.List;

public class BinarygeneratorTest {
    @Test
    void binarytest(){
      int n = 5;
      List<String> expected = Arrays.asList("1", "10", "11", "100", "101");
      assertEquals(expected, BinaryNumberGenerator.generateBinaryNumbers(n));
    }
}
