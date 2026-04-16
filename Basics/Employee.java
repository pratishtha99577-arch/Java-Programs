public class Employee {
    private String firstName;
    private String lastName;
    private double salary;

    // Constructor
    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;

        if (salary > 0)
            this.salary = salary;
        else
            this.salary = 0.0;
    }

    // Getter methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }
}