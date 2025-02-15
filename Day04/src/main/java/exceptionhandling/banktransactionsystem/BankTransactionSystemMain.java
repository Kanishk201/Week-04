package exceptionhandling.banktransactionsystem;

import java.util.*;

public class BankTransactionSystemMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount(1000);

        try {
            System.out.print("Enter withdrawal amount: ");
            double amount = scanner.nextDouble();
            account.withdraw(amount);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Transaction completed.");
        }
    }
}
