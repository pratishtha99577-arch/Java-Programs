abstract class Employee {

    // Abstract method
    abstract double getAmount();
}

// HourlyEmployee Class
class HourlyEmployee extends Employee {
    int noOfHours;
    double hourlyRate;

    HourlyEmployee(int noOfHours, double hourlyRate) {
        this.noOfHours = noOfHours;
        this.hourlyRate = hourlyRate;
    }

    double getAmount() {
        return noOfHours * hourlyRate;
    }
}

// WeeklyEmployee Class
class WeeklyEmployee extends Employee {
    int noOfWeeks;
    double weeklyRate;

    WeeklyEmployee(int noOfWeeks, double weeklyRate) {
        this.noOfWeeks = noOfWeeks;
        this.weeklyRate = weeklyRate;
    }

    double getAmount() {
        return noOfWeeks * weeklyRate;
    }
}

// Main Class
public class EmployeeTest3 {
    public static void main(String[] args) {

        // Hourly Employee Object
        HourlyEmployee h = new HourlyEmployee(160, 200);

        System.out.println("=== Hourly Employee ===");
        System.out.println("No. of Hours: 160");
        System.out.println("Hourly Rate: 200");
        System.out.println("Amount Paid: " + h.getAmount());

        // Weekly Employee Object
        WeeklyEmployee w = new WeeklyEmployee(4, 12000);

        System.out.println("\n=== Weekly Employee ===");
        System.out.println("No. of Weeks: 4");
        System.out.println("Weekly Rate: 12000");
        System.out.println("Amount Paid: " + w.getAmount());
    }
}