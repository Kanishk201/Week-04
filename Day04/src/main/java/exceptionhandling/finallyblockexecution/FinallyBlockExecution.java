package exceptionhandling.finallyblockexecution;
import java.util.*;

public class FinallyBlockExecution {
    public static int divide(int a, int b) {
        return a / b;
    }

    public static void finallyBlockExecution() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();
            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();

            int result = divide(numerator, denominator);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("Invalid input.");
        } finally {
            System.out.println("Operation completed.");
        }
    }
}
