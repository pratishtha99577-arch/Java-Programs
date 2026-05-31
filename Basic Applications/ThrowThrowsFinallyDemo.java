public class ThrowThrowsFinallyDemo {

    // Method using throws
    static void checkException() throws Exception {

        // Using throw to create and throw Exception object
        throw new Exception("Custom Exception Generated");
    }

    public static void main(String[] args) {

        try {

            // Calling method that throws Exception
            checkException();

        }

        // Catching the Exception
        catch (Exception e) {

            System.out.println("Exception Caught: " + e.getMessage());
        }

        // Finally block
        finally {

            System.out.println("Finally block executed.");
        }
    }
}