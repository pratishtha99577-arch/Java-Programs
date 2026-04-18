public class Account {
    private double balance;

    // Constructor
    public Account(double balance) {
        if (balance > 0)
            this.balance = balance;
        else
            this.balance = 0.0;
    }

    public double getBalance() {
        return balance;
    }
}