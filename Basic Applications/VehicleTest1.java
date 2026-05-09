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

// TwoWheeler Class
class TwoWheeler extends Vehicle {
    protected String type;
    protected String companyName;

    TwoWheeler(String vehicleNumber, String insuranceNumber,
               String color, double consumption,
               String type, String companyName) {

        super(vehicleNumber, insuranceNumber, color, consumption);

        this.type = type;
        this.companyName = companyName;
    }

    String getType() {
        return type;
    }

    String getName() {
        return companyName;
    }
}

// Geared subclass
class Geared extends TwoWheeler {

    Geared(String vehicleNumber, String insuranceNumber,
           String color, double consumption,
           String companyName) {

        super(vehicleNumber, insuranceNumber,
              color, consumption,
              "Geared", companyName);
    }

    void average() {
        System.out.println("Average of Geared Two Wheeler: "
                + getConsumption() + " km/l");
    }
}

// NonGeared subclass
class NonGeared extends TwoWheeler {

    NonGeared(String vehicleNumber, String insuranceNumber,
              String color, double consumption,
              String companyName) {

        super(vehicleNumber, insuranceNumber,
              color, consumption,
              "Non-Geared", companyName);
    }

    void average() {
        System.out.println("Average of Non-Geared Two Wheeler: "
                + getConsumption() + " km/l");
    }
}

// Main Class
public class VehicleTest1 {
    public static void main(String[] args) {

        // Geared Vehicle Object
        Geared g = new Geared(
                "MP04AB1234",
                "INS12345",
                "Black",
                55,
                "Hero"
        );

        System.out.println("=== Geared Two Wheeler ===");
        g.displayConsumption();
        System.out.println("Type: " + g.getType());
        System.out.println("Company Name: " + g.getName());
        g.average();

        // Non-Geared Vehicle Object
        NonGeared n = new NonGeared(
                "MP04XY5678",
                "INS67890",
                "Red",
                65,
                "Honda"
        );

        System.out.println("\n=== Non-Geared Two Wheeler ===");
        n.displayConsumption();
        System.out.println("Type: " + n.getType());
        System.out.println("Company Name: " + n.getName());
        n.average();
    }
}