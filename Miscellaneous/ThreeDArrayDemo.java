import java.util.Random;

public class ThreeDArrayDemo {

    public static void main(String[] args) {

        // Create a 3 x 4 x 6 array
        int[][][] array = new int[3][4][6];

        Random random = new Random();

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        // Fill the array with random numbers and find largest & smallest
        System.out.println("Elements of the 3D Array:\n");

        for (int i = 0; i < 3; i++) {

            System.out.println("Layer " + (i + 1) + ":");

            for (int j = 0; j < 4; j++) {

                for (int k = 0; k < 6; k++) {

                    array[i][j][k] = random.nextInt(100); // Random numbers (0-99)

                    System.out.print(array[i][j][k] + "\t");

                    if (array[i][j][k] > largest) {
                        largest = array[i][j][k];
                    }

                    if (array[i][j][k] < smallest) {
                        smallest = array[i][j][k];
                    }
                }

                System.out.println();
            }

            System.out.println();
        }

        // Display largest and smallest values
        System.out.println("Largest Value : " + largest);
        System.out.println("Smallest Value: " + smallest);
    }
}