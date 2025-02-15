package exceptionhandling.customexception;
import java.io.*;

public class CustomException {
    public static void validateAge(int age) throws InvalidAgeException{
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
        System.out.println("Access granted!");
    }
}
