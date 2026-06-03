class MyThread extends Thread {

    // Thread task
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

public class ThreadDemo {

    public static void main(String[] args) {

        // Creating thread object
        MyThread t = new MyThread();

        // Starting thread
        t.start();

        // Main thread
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