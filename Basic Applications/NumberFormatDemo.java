public class NumberFormatDemo {

    public static void main(String[] args) {

        try {

            // String containing invalid number
            String str = "12Q";

            // Converting string to integer
            int num = Integer.parseInt(str);

            System.out.println("Number = " + num);
        }

        // Handling NumberFormatException
        catch (NumberFormatException e) {

            System.out.println("Error: Invalid number format.");
        }

        finally {

            System.out.println("Program Executed Successfully.");
        }
    }
}