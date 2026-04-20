public class AccountTest {

    // Account class
    static class Account {
        private double balance;

        // Constructor
        public Account(double initialBalance) {
            if (initialBalance > 0) {
                balance = initialBalance;
            } else {
                balance = 0;
            }
        }

        // Credit method
        public void credit(double amount) {
            balance = balance + amount;
        }

        // Debit method
        public void debit(double amount) {
            if (amount > balance) {
                System.out.println("Debit amount exceeded account balance");
            } else {
                balance = balance - amount;
            }
        }

        // Get balance
        public double getBalance() {
            return balance;
        }
    }

    // Main method (testing)
    public static void main(String[] args) {

        Account acc = new Account(1000);

        System.out.println("Initial Balance: " + acc.getBalance());

        acc.credit(500);
        System.out.println("After credit: " + acc.getBalance());

        acc.debit(300);
        System.out.println("After debit: " + acc.getBalance());

        acc.debit(1500); // exceeding case
        System.out.println("Final Balance: " + acc.getBalance());
    }
}