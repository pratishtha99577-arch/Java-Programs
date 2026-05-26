public class NullPointerDemo {

    public static void main(String[] args) {

        try {

            // String object pointing to null
            String name = null;

            // Trying to access method on null object
            System.out.println("Length of String: "
                    + name.length());
        }

        // Handling NullPointerException
        catch (NullPointerException e) {

            System.out.println("Error: Object points to null.");
        }

        finally {

            System.out.println("Program Executed Successfully.");
        }
    }
}