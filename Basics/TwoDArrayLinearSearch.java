import java.util.*;

public class TwoDArrayLinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols = sc.nextInt();
        int[][] numbers = new int[rows][cols];

        System.out.println("Enter the elements of the array: ");

        //input
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the element to search: ");

        int x = sc.nextInt();

        //output
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                if(numbers[i][j] == x) {
                    System.out.println("Element found at index: (" + i + ", " + j + ")");
                }
            }
            System.out.println();
        }

    }
    
}    
