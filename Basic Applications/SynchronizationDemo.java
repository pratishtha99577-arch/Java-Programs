class Counter {

    int count = 0;

    // Synchronized method
    synchronized void increment() {
        count++;

        System.out.println(
            Thread.currentThread().getName()
            + " Count = " + count
        );
    }
}

class MyThread extends Thread {

    Counter c;

    MyThread(Counter c, String name) {
        super(name);
        this.c = c;
    }

    public void run() {

        for (int i = 1; i <= 5; i++) {
            c.increment();

            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class SynchronizationDemo {

    public static void main(String[] args) {

        Counter c = new Counter();

        MyThread t1 = new MyThread(c, "Thread-1");
        MyThread t2 = new MyThread(c, "Thread-2");

        t1.start();
        t2.start();
    }
}