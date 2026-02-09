import java.util.*;


public class GreaterOfTwoNumbers {
   public static int getGreater(int a, int b) {
      if(a > b) {
          return a;
      } else {
          return b;
      }
   }
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter two numbers: ");
      int a = sc.nextInt();
      int b = sc.nextInt();
      System.out.println("Greater number is: ");
      System.out.println(getGreater(a, b));
   }   
}

