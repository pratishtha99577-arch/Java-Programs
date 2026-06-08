class Buffer {
    private int data;
    private boolean available = false;

    // Producer method
    synchronized void produce(int value) {

        while (available) {
            try {
                wait();
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        data = value;
        available = true;

        System.out.println("Produced: " + data);

        notify();
    }

    // Consumer method
    synchronized void consume() {

        while (!available) {
            try {
                wait();
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        System.out.println("Consumed: " + data);

        available = false;

        notify();
    }
}

// Producer Thread
class Producer extends Thread {
    Buffer b;

    Producer(Buffer b) {
        this.b = b;
    }

    public void run() {

        for (int i = 1; i <= 5; i++) {
            b.produce(i);

            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Consumer Thread
class Consumer extends Thread {
    Buffer b;

    Consumer(Buffer b) {
        this.b = b;
    }

    public void run() {

        for (int i = 1; i <= 5; i++) {
            b.consume();

            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Main Class
public class ProducerConsumerDemo {

    public static void main(String[] args) {

        Buffer buffer = new Buffer();

        Producer p = new Producer(buffer);
        Consumer c = new Consumer(buffer);

        p.start();
        c.start();
    }
}