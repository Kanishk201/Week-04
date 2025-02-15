package exceptionhandling.customexception;
import java.util.*;


public class CustomExceptionMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            CustomException.validateAge(age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid numeric value.");
        }
    }
}
