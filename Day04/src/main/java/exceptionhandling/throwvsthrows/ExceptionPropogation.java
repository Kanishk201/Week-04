package exceptionhandling.throwvsthrows;

import java.util.*;

public class ExceptionPropogation {
    public static double calculateInterest(double amount, double rate, double years) throws IllegalArgumentException {
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Amount and rate must be positive");
        }
        return (amount * rate * years) / 100;
    }

    public static void exceptionPropogation() {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Principal: ");
            double principal = sc.nextDouble();

            System.out.print("Enter Rate: ");
            double rate = sc.nextDouble();

            System.out.print("Enter time: ");
            double time = sc.nextDouble();
            double interest = calculateInterest(principal, rate, time);
            System.out.println("Calculated Interest: " + interest);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: Amount and rate must be positive");
        }
    }
}

