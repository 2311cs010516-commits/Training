class InvalidTransactionException extends Exception {
    public InvalidTransactionException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) throws InvalidTransactionException {
        if (amount <= 0) {
            throw new InvalidTransactionException("Deposit amount must be positive");
        }
        balance += amount;
        System.out.println("Deposit successful. Balance: " + balance);
    }

    public void withdraw(double amount) throws InvalidTransactionException {
        if (amount <= 0) {
            throw new InvalidTransactionException("Withdrawal amount must be positive");
        }
        if (amount > balance) {
            throw new InvalidTransactionException("Insufficient balance");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Balance: " + balance);
    }

    public void showBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000);

        try {
            account.deposit(2000);
            account.withdraw(1000);
            account.withdraw(7000);
        } catch (InvalidTransactionException e) {
            System.out.println("Transaction Error: " + e.getMessage());
        }

        account.showBalance();
    }
}
