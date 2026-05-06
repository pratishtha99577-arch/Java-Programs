class Employee {
    protected String firstName;
    protected String lastName;

    // Constructor
    Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getter methods
    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }
}

// Contract Employee
class ContractEmployee extends Employee {
    private String department;
    private String designation;
    private double salary;

    ContractEmployee(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    void setDepartment(String dept) {
        department = dept;
    }

    void setDesignation(String desig) {
        designation = desig;
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

    void displaySalary() {
        System.out.println("Salary (Contract): " + salary);
    }
}

// Regular Employee
class RegularEmployee extends Employee {
    private String department;
    private String designation;
    private double salary;

    RegularEmployee(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    void setDepartment(String dept) {
        department = dept;
    }

    void setDesignation(String desig) {
        designation = desig;
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

    void displaySalary() {
        System.out.println("Salary (Regular): " + salary);
    }
}

// Main Class
public class EmployeeTest1 {
    public static void main(String[] args) {

        ContractEmployee c = new ContractEmployee("John", "Doe", 25000);
        c.setDepartment("IT");
        c.setDesignation("Developer");

        System.out.println("=== Contract Employee ===");
        c.displayFullName();
        System.out.println("Department: " + c.getDepartment());
        System.out.println("Designation: " + c.getDesig());
        c.displaySalary();

        RegularEmployee r = new RegularEmployee("Jane", "Smith", 40000);
        r.setDepartment("HR");
        r.setDesignation("Manager");

        System.out.println("\n=== Regular Employee ===");
        r.displayFullName();
        System.out.println("Department: " + r.getDepartment());
        System.out.println("Designation: " + r.getDesig());
        r.displaySalary();
    }
}