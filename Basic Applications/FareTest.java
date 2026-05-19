interface Fare {

    // Method declaration
    double getAmount();
}

// Bus Class
class Bus implements Fare {
    private int distance;
    private double ratePerKm;

    Bus(int distance, double ratePerKm) {
        this.distance = distance;
        this.ratePerKm = ratePerKm;
    }

    // Implementing getAmount()
    public double getAmount() {
        return distance * ratePerKm;
    }

    void display() {
        System.out.println("=== Bus Fare Details ===");
        System.out.println("Distance Travelled: " + distance + " km");
        System.out.println("Fare Amount: " + getAmount());
    }
}

// Train Class
class Train implements Fare {
    private int distance;
    private double ratePerKm;

    Train(int distance, double ratePerKm) {
        this.distance = distance;
        this.ratePerKm = ratePerKm;
    }

    // Implementing getAmount()
    public double getAmount() {
        return distance * ratePerKm;
    }

    void display() {
        System.out.println("\n=== Train Fare Details ===");
        System.out.println("Distance Travelled: " + distance + " km");
        System.out.println("Fare Amount: " + getAmount());
    }
}

// Main Class
public class FareTest {
    public static void main(String[] args) {

        // Bus Object
        Bus b = new Bus(50, 2.5);

        b.display();

        // Train Object
        Train t = new Train(120, 1.8);

        t.display();
    }
}