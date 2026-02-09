import java.util.*;


public class CircleCircumference {
   public static Double getCircumference(Double radius) {
       return 2 * 3.14 * radius;
   }
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the radius of the circle:");
      Double r = sc.nextDouble();
      System.out.println("The circumference of the circle is:");
      System.out.println(getCircumference(r));
   }   
}

