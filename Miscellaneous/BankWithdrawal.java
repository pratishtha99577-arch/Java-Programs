class BankAccount {

    private int balance = 10000;

    // Synchronized withdrawal method
    synchronized void withdraw(String user, int amount) {

        System.out.println(user + " is trying to withdraw ₹" + amount);

        // Check whether sufficient balance is available
        if (balance >= amount) {

            System.out.println(user + " is processing withdrawal...");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            balance = balance - amount;

            System.out.println(user + " successfully withdrew ₹" + amount);
            System.out.println("Remaining Balance: ₹" + balance);

        } else {

            System.out.println(user + " cannot withdraw ₹" + amount);
            System.out.println("Insufficient Balance!");
            System.out.println("Available Balance: ₹" + balance);
        }

        System.out.println("--------------------------------");
    }
}


// User class
class User extends Thread {

    BankAccount account;
    String userName;
    int amount;

    User(BankAccount account, String userName, int amount) {

        this.account = account;
        this.userName = userName;
        this.amount = amount;
    }

    public void run() {

        account.withdraw(userName, amount);
    }
}


// Main class
public class BankWithdrawal {

    public static void main(String[] args) {

        // Create one common bank account
        BankAccount account = new BankAccount();

        // Create multiple users
        User user1 = new User(account, "User 1", 4000);
        User user2 = new User(account, "User 2", 3000);
        User user3 = new User(account, "User 3", 5000);
        User user4 = new User(account, "User 4", 2000);

        // Start all users
        user1.start();
        user2.start();
        user3.start();
        user4.start();

        // Wait for all users to finish
        try {

            user1.join();
            user2.join();
            user3.join();
            user4.join();

        } catch (InterruptedException e) {

            System.out.println(e);
        }

        System.out.println("================================");
        System.out.println("All transactions completed.");
        System.out.println("================================");
    }
}