class MyRunnable implements Runnable {

    // Implementing run() method
    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread: " + i);

            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class RunnableThreadDemo {

    public static void main(String[] args) {

        // Creating Runnable object
        MyRunnable r = new MyRunnable();

        // Passing Runnable object to Thread
        Thread t = new Thread(r);

        // Starting thread
        t.start();

        // Main Thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);

            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}