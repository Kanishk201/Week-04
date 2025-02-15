package junittesting.basiicjunittesting.exceptionhandlingtesting;

import static org.junit.jupiter.api.Assertions.*;

import junitproblems.basicjunitproblems.testingcalculator.Calculator;
import org.junit.jupiter.api.Test;


public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void testDivide() {
        assertEquals(5, calculator.divide(10, 2));  // Normal division
        assertEquals(-3, calculator.divide(-9, 3)); // Negative case
    }

    @Test
    void testDivideByZeroException() {
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}

