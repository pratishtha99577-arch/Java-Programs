public class AccountCredit {
    private double balance;

    // Constructor
    public AccountCredit(double balance) {
        if (balance > 0)
            this.balance = balance;
        else
            this.balance = 0.0;
    }

    // Credit method (add money)
    public void credit(double amount) {
        if (amount > 0)
            balance = balance + amount;
    }

    // Get balance
    public double getBalance() {
        return balance;
    }
}