package bankingsystem;

public class Main {
    public static void main(String[] args) {
        BankSystem bank = new BankSystem();
        bank.createAccount(1001, 5000.00);
        bank.createAccount(1002, 3000.00);
        bank.createAccount(1003, 7000.00);

        bank.deposit(1001, 1500.00);
        bank.requestWithdrawal(1002, 2000.00);
        bank.requestWithdrawal(1003, 8000.00);

        bank.processWithdrawals();
        bank.displaySortedAccounts();
    }
}

