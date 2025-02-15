package exceptionhandling.uncheckedexception;
import java.io.*;
import java.util.*;

public class UncheckedException {
    public static void uncheckedException() {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Enter numerator: ");
            int numerator = sc.nextInt();

            System.out.print("Enter denomionator: ");
            int denominator = sc.nextInt();

            int result = numerator / denominator;
            System.out.println("Result: " + result);
        }

        catch (ArithmeticException e){
            System.out.println("Error: Divison by zero is not allowed");
        } catch (InputMismatchException e){
            System.out.println("Error: Please enter a valid numeric value");
        }
    }
}
