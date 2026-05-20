interface StudentFee {

    // Interface methods
    double getAmount();

    String getFirstName();

    String getLastName();

    String getAddress();

    String getContact();
}

// Hostler Class
class Hostler implements StudentFee {
    private String firstName;
    private String lastName;
    private String address;
    private String contact;
    private double hostelFee;

    Hostler(String firstName,
             String lastName,
             String address,
             String contact,
             double hostelFee) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.contact = contact;
        this.hostelFee = hostelFee;
    }

    public double getAmount() {
        return hostelFee;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getContact() {
        return contact;
    }

    void display() {
        System.out.println("=== Hostler Student ===");
        System.out.println("Name: "
                + getFirstName() + " " + getLastName());
        System.out.println("Address: " + getAddress());
        System.out.println("Contact: " + getContact());
        System.out.println("Fee Paid: " + getAmount());
    }
}

// NonHostler Class
class NonHostler implements StudentFee {
    private String firstName;
    private String lastName;
    private String address;
    private String contact;
    private double fee;

    NonHostler(String firstName,
                String lastName,
                String address,
                String contact,
                double fee) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.contact = contact;
        this.fee = fee;
    }

    public double getAmount() {
        return fee;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getContact() {
        return contact;
    }

    void display() {
        System.out.println("\n=== Non-Hostler Student ===");
        System.out.println("Name: "
                + getFirstName() + " " + getLastName());
        System.out.println("Address: " + getAddress());
        System.out.println("Contact: " + getContact());
        System.out.println("Fee Paid: " + getAmount());
    }
}

// Main Class
public class StudentFeeTest {
    public static void main(String[] args) {

        // Hostler Object
        Hostler h = new Hostler(
                "John",
                "Doe",
                "Bhopal",
                "9876543210",
                45000
        );

        h.display();

        // NonHostler Object
        NonHostler n = new NonHostler(
                "Jane",
                "Smith",
                "Indore",
                "9123456780",
                25000
        );

        n.display();
    }
}