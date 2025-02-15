package junittesting.basiicjunittesting.calculatortesting;

import static org.junit.jupiter.api.Assertions.*;

import junitproblems.basicjunitproblems.testingcalculator.Calculator;
import org.junit.jupiter.api.Test;


public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertEquals(10, calculator.add(5, 5));
        assertEquals(0, calculator.add(-3, 3));
    }

    @Test
    void testSubtraction() {
        assertEquals(2, calculator.subtract(5, 3));
        assertEquals(-8, calculator.subtract(-5, 3));
    }

    @Test
    void testMultiplication() {
        assertEquals(15, calculator.multiply(3, 5));
        assertEquals(0, calculator.multiply(3, 0));
    }

    @Test
    void testDivision() {
        assertEquals(2, calculator.divide(10, 5));
        assertEquals(-3, calculator.divide(-9, 3));
    }
}
