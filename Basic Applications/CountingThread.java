class CountThread extends Thread {

    // Overriding run() method
    public void run() {

        for (int i = 1; i <= 10; i++) {
            System.out.println("Count: " + i);

            try {
                Thread.sleep(500); // Delay of 500 milliseconds
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class CountingThread {

    public static void main(String[] args) {

        // Creating thread object
        CountThread t = new CountThread();

        // Starting thread
        t.start();
    }
}