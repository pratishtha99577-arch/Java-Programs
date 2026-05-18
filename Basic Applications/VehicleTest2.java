interface Vehicle {

    // Interface methods
    String getColor();

    String getNumber();

    double getConsumption();
}

// TwoWheeler Class
class TwoWheeler implements Vehicle {
    private String color;
    private String vehicleNumber;
    private double fuelConsumed;

    TwoWheeler(String color,
               String vehicleNumber,
               double fuelConsumed) {

        this.color = color;
        this.vehicleNumber = vehicleNumber;
        this.fuelConsumed = fuelConsumed;
    }

    public String getColor() {
        return color;
    }

    public String getNumber() {
        return vehicleNumber;
    }

    public double getConsumption() {
        return fuelConsumed;
    }

    void display() {
        System.out.println("=== Two Wheeler ===");
        System.out.println("Vehicle Number: " + getNumber());
        System.out.println("Color: " + getColor());
        System.out.println("Fuel Consumed: "
                           + getConsumption() + " litres");
    }
}

// FourWheeler Class
class FourWheeler implements Vehicle {
    private String color;
    private String vehicleNumber;
    private double fuelConsumed;

    FourWheeler(String color,
                String vehicleNumber,
                double fuelConsumed) {

        this.color = color;
        this.vehicleNumber = vehicleNumber;
        this.fuelConsumed = fuelConsumed;
    }

    public String getColor() {
        return color;
    }

    public String getNumber() {
        return vehicleNumber;
    }

    public double getConsumption() {
        return fuelConsumed;
    }

    void display() {
        System.out.println("\n=== Four Wheeler ===");
        System.out.println("Vehicle Number: " + getNumber());
        System.out.println("Color: " + getColor());
        System.out.println("Fuel Consumed: "
                           + getConsumption() + " litres");
    }
}

// Main Class
public class VehicleTest2 {
    public static void main(String[] args) {

        // Two Wheeler Object
        TwoWheeler t = new TwoWheeler(
                "Black",
                "MP04AB1234",
                3.5
        );

        t.display();

        // Four Wheeler Object
        FourWheeler f = new FourWheeler(
                "White",
                "MP04XY5678",
                10.2
        );

        f.display();
    }
}