import java.util.*;


public class StringArrayInput {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of array : ");
      int size = sc.nextInt();
      System.out.println("Enter the names : ");
      String names[] = new String[size];


      //input
      for(int i=0; i<size; i++) {
          names[i] = sc.next();
      }
     
      //output
       for(int i=0; i<names.length; i++) {
           System.out.println("name " + (i+1) +" is : " + names[i]);
       }
      
   }
}

