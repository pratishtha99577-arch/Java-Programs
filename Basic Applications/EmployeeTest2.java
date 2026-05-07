class Employee {
    protected String firstName;
    protected String lastName;

    // Constructor
    Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }
}

// Superclass ContractEmployee
class ContractEmployee extends Employee {
    protected String department;
    protected String designation;

    ContractEmployee(String firstName, String lastName,
                     String department, String designation) {

        super(firstName, lastName);
        this.department = department;
        this.designation = designation;
    }

    String getDepartment() {
        return department;
    }

    String getDesig() {
        return designation;
    }

    void displayFullName() {
        System.out.println("Full Name: " + firstName + " " + lastName);
    }
}

// HourlyEmployee subclass
class HourlyEmployee extends ContractEmployee {
    private int hours;
    private double wagesPerHour;

    HourlyEmployee(String firstName, String lastName,
                   String department, int hours, double wagesPerHour) {

        super(firstName, lastName, department, "Hourly Employee");

        this.hours = hours;
        this.wagesPerHour = wagesPerHour;
    }

    double calculateWages() {
        return hours * wagesPerHour;
    }

    // Overriding method
    @Override
    String getDesig() {
        return "Hourly Employee";
    }
}

// WeeklyEmployee subclass
class WeeklyEmployee extends ContractEmployee {
    private int weeks;
    private double wagesPerWeek;

    WeeklyEmployee(String firstName, String lastName,
                   String department, int weeks, double wagesPerWeek) {

        super(firstName, lastName, department, "Weekly Employee");

        this.weeks = weeks;
        this.wagesPerWeek = wagesPerWeek;
    }

    double calculateWages() {
        return weeks * wagesPerWeek;
    }

    // Overriding method
    @Override
    String getDesig() {
        return "Weekly Employee";
    }
}

// Main Class
public class EmployeeTest2 {
    public static void main(String[] args) {

        // Hourly Employee Object
        HourlyEmployee h = new HourlyEmployee(
                "John",
                "Doe",
                "IT",
                160,
                200
        );

        System.out.println("=== Hourly Employee ===");
        h.displayFullName();
        System.out.println("Department: " + h.getDepartment());
        System.out.println("Designation: " + h.getDesig());
        System.out.println("Monthly Salary: " + h.calculateWages());

        // Weekly Employee Object
        WeeklyEmployee w = new WeeklyEmployee(
                "Jane",
                "Smith",
                "HR",
                4,
                12000
        );

        System.out.println("\n=== Weekly Employee ===");
        w.displayFullName();
        System.out.println("Department: " + w.getDepartment());
        System.out.println("Designation: " + w.getDesig());
        System.out.println("Monthly Salary: " + w.calculateWages());
    }
}