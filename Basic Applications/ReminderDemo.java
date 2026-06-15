class ReminderThread extends Thread {

    String message;
    int seconds;

    ReminderThread(String message, int seconds) {
        this.message = message;
        this.seconds = seconds;
    }

    public void run() {

        try {
            Thread.sleep(seconds * 1000);

            System.out.println("Reminder: " + message);
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class ReminderDemo {

    public static void main(String[] args) {

        System.out.println("Reminder is set for 5 seconds...");

        ReminderThread t =
                new ReminderThread("Time to Study Java!", 5);

        t.start();
    }
}