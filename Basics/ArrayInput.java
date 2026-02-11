import java.util.*;

public class ArrayInput {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        System.out.println("Enter " + size + " elements: ");
        int numbers[] = new int[size];

        //input
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
         }
         
         
    // output
        for(int i=0; i<size; i++){
            System.out.println("Element at index " + i + ": ");
            System.out.println(numbers[i]);
        }
    }
}
