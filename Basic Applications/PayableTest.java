interface Payable {

    // Method declaration
    double getAmount();
}

// Invoice Class
class Invoice implements Payable {
    private int quantity;
    private double pricePerItem;

    Invoice(int quantity, double pricePerItem) {
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    // Implementing getAmount()
    public double getAmount() {
        return quantity * pricePerItem;
    }
}

// Employee Class
class Employee implements Payable {
    private String name;
    private double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Implementing getAmount()
    public double getAmount() {
        return salary;
    }

    String getName() {
        return name;
    }
}

// Main Class
public class PayableTest {
    public static void main(String[] args) {

        // Invoice Object
        Invoice i = new Invoice(5, 200);

        System.out.println("=== Invoice Details ===");
        System.out.println("Amount to be Paid: " + i.getAmount());

        // Employee Object
        Employee e = new Employee("John", 45000);

        System.out.println("\n=== Employee Details ===");
        System.out.println("Employee Name: " + e.getName());
        System.out.println("Salary Amount: " + e.getAmount());
    }
}