public class RethrowExceptionDemo {

    // Method two() throws an exception
    static void two() throws Exception {
        System.out.println("Inside Method two()");
        throw new Exception("Exception generated in Method two()");
    }

    // Method one() catches and rethrows the exception
    static void one() throws Exception {

        try {
            two();
        }

        catch (Exception e) {
            System.out.println("Exception caught in Method one()");
            System.out.println("Message: " + e.getMessage());

            // Rethrowing the exception
            throw e;
        }
    }

    public static void main(String[] args) {

        try {
            one();
        }

        catch (Exception e) {
            System.out.println("Exception caught again in main()");
            System.out.println("Message: " + e.getMessage());
        }

        finally {
            System.out.println("Program Executed Successfully.");
        }
    }
}