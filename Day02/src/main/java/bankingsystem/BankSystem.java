package bankingsystem;

import java.util.*;

public class BankSystem {
    private Map<Integer, Double> accounts = new HashMap<>();
    private TreeMap<Double, Integer> sortedAccounts = new TreeMap<>();
    private Queue<WithdrawalRequest> withdrawalQueue = new LinkedList<>();

    // Create account
    public void createAccount(int accountNumber, double initialBalance) {
        accounts.put(accountNumber, initialBalance);
        sortedAccounts.put(initialBalance, accountNumber);
    }

    // Deposit money
    public void deposit(int accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) {
            double newBalance = accounts.get(accountNumber) + amount;
            sortedAccounts.remove(accounts.get(accountNumber));
            accounts.put(accountNumber, newBalance);
            sortedAccounts.put(newBalance, accountNumber);
            System.out.println("Deposited " + amount + " to account " + accountNumber);
        } else {
            System.out.println("Account does not exist!");
        }
    }

    // Withdraw money (using queue)
    public void requestWithdrawal(int accountNumber, double amount) {
        withdrawalQueue.add(new WithdrawalRequest(accountNumber, amount));
        System.out.println("Withdrawal request added for " + amount + " from account " + accountNumber);
    }

    public void processWithdrawals() {
        while (!withdrawalQueue.isEmpty()) {
            WithdrawalRequest request = withdrawalQueue.poll();
            int accountNumber = request.accountNumber;
            double amount = request.amount;

            if (accounts.containsKey(accountNumber) && accounts.get(accountNumber) >= amount) {
                double newBalance = accounts.get(accountNumber) - amount;
                sortedAccounts.remove(accounts.get(accountNumber));
                accounts.put(accountNumber, newBalance);
                sortedAccounts.put(newBalance, accountNumber);
                System.out.println("Withdrawn " + amount + " from account " + accountNumber);
            } else {
                System.out.println("Insufficient funds or account does not exist for account " + accountNumber);
            }
        }
    }

    // Display all accounts sorted by balance
    public void displaySortedAccounts() {
        System.out.println("Accounts sorted by balance:");
        for (Map.Entry<Double, Integer> entry : sortedAccounts.entrySet()) {
            System.out.println("Account: " + entry.getValue() + " | Balance: " + entry.getKey());
        }
    }}