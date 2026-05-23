import java.util.Scanner;

public class DivisionException {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2, result;

        try {

            // User input
            System.out.print("Enter first number: ");
            num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            num2 = sc.nextInt();

            // Division
            result = num1 / num2;

            System.out.println("Result = " + result);
        }

        // Handling division by zero
        catch (ArithmeticException e) {

            System.out.println("Error: Cannot divide by zero.");
        }

        // Handling invalid input
        catch (Exception e) {

            System.out.println("Invalid Input.");
        }

        finally {

            System.out.println("Program Executed Successfully.");
        }

        sc.close();
    }
}