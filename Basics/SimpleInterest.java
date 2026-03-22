import java.util.*;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle Amount :");
        int p = sc.nextInt();
        System.out.println("Enter Rate of Interest :");
        int r = sc.nextInt();
        System.out.println("Enter Time Period :");
        int t = sc.nextInt();

        int simpleInterest = (p * r * t) / 100;
        System.out.println("Simple Interest is : " + simpleInterest);
    }
}
