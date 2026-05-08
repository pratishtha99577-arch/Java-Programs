class Vehicle {
    protected String vehicleNumber;
    protected String insuranceNumber;
    protected String color;
    protected double consumption;

    // Constructor
    Vehicle(String vehicleNumber, String insuranceNumber,
            String color, double consumption) {

        this.vehicleNumber = vehicleNumber;
        this.insuranceNumber = insuranceNumber;
        this.color = color;
        this.consumption = consumption;
    }

    double getConsumption() {
        return consumption;
    }

    void displayConsumption() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Insurance Number: " + insuranceNumber);
        System.out.println("Color: " + color);
        System.out.println("Consumption: " + consumption + " km/l");
    }
}

// TwoWheeler subclass
class TwoWheeler extends Vehicle {

    TwoWheeler(String vehicleNumber, String insuranceNumber,
               String color, double consumption) {

        super(vehicleNumber, insuranceNumber, color, consumption);
    }

    void maintenance() {
        System.out.println("Two Wheeler Maintenance: Rs. 1500 per month");
    }

    void average() {
        System.out.println("Average of Two Wheeler: " + getConsumption() + " km/l");
    }
}

// FourWheeler subclass
class FourWheeler extends Vehicle {

    FourWheeler(String vehicleNumber, String insuranceNumber,
                String color, double consumption) {

        super(vehicleNumber, insuranceNumber, color, consumption);
    }

    void maintenance() {
        System.out.println("Four Wheeler Maintenance: Rs. 5000 per month");
    }

    void average() {
        System.out.println("Average of Four Wheeler: " + getConsumption() + " km/l");
    }
}

// Main Class
public class VehicleTest {
    public static void main(String[] args) {

        // Two Wheeler Object
        TwoWheeler t = new TwoWheeler(
                "MP04AB1234",
                "INS12345",
                "Black",
                55
        );

        System.out.println("=== Two Wheeler ===");
        t.displayConsumption();
        t.maintenance();
        t.average();

        // Four Wheeler Object
        FourWheeler f = new FourWheeler(
                "MP04XY5678",
                "INS67890",
                "White",
                18
        );

        System.out.println("\n=== Four Wheeler ===");
        f.displayConsumption();
        f.maintenance();
        f.average();
    }
}