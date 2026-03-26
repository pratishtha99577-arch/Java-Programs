import java.util.*;

public class CelciusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius :");
        int c = sc.nextInt();
        
        double fahrenheit = (c * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit is : " + fahrenheit);
    }
}