import java.util.*;

public class arraySearch {
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
         
         System.out.println("Enter the element to be searched: " );
         int x = sc.nextInt();
         


         //output
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == x){
                System.out.println("x found at index : " + i);
            }
            
        }
    }
}

