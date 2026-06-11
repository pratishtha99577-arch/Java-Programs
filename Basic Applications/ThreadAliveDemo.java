class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");

        try {
            Thread.sleep(3000); // Pause for 3 seconds
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Thread execution completed.");
    }
}

public class ThreadAliveDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();

        System.out.println("Before starting thread, isAlive(): " + t1.isAlive());

        t1.start();

        System.out.println("After starting thread, isAlive(): " + t1.isAlive());

        try {
            t1.join(); // Wait for thread to finish
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("After thread completion, isAlive(): " + t1.isAlive());
    }
}