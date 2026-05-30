public class CatchOrderDemo {

    public static void main(String[] args) {

        try {

            int result = 10 / 0;

            System.out.println("Result = " + result);

        }

        // Subclass exception first
        catch (ArithmeticException e) {

            System.out.println("Arithmetic Exception Caught");
        }

        // Superclass exception after subclass
        catch (Exception e) {

            System.out.println("General Exception Caught");
        }

        finally {

            System.out.println("Program Executed Successfully.");
        }
    }
}