public class ClassNotFoundDemo {

    public static void main(String[] args) {

        try {

            // Trying to load a class that does not exist
            Class.forName("TestClass");

            System.out.println("Class Found.");
        }

        // Handling ClassNotFoundException
        catch (ClassNotFoundException e) {

            System.out.println("Error: Class not found.");
        }

        finally {

            System.out.println("Program Executed Successfully.");
        }
    }
}