public class ArrayException {

    public static void main(String[] args) {

        try {

            // Integer Array
            int arr[] = new int[5];

            // Storing values
            arr[0] = 10;
            arr[1] = 20;
            arr[2] = 30;
            arr[3] = 40;
            arr[4] = 50;

            // Buffer Overflow (Array Index Out of Bounds)
            arr[5] = 60;

            System.out.println("Values stored successfully.");
        }

        catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Error: Array index exceeds array size.");
        }

        finally {

            System.out.println("Program Executed.");
        }
    }
}