public class EmployeeTest {
    public static void main(String[] args) {

        Employee emp1 = new Employee("John", "Doe", 30000);
        Employee emp2 = new Employee("Jane", "Smith", 40000);

        System.out.println("Employee 1 Yearly Salary: " + (emp1.getSalary() * 12));
        System.out.println("Employee 2 Yearly Salary: " + (emp2.getSalary() * 12));
    }
}