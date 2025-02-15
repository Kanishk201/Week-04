package junitproblems.basicjunitproblems.testexceptionhandling;

public class ExceptionHandlingTesting {
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}
