import java.util.*;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle Amount :");
        int p = sc.nextInt();
        System.out.println("Enter Rate of Interest :");
        int r = sc.nextInt();
        System.out.println("Enter Time Period :");
        int t = sc.nextInt();

        int compoundInterest = (int) (p * Math.pow(1 + r / 100.0, t) - p);
        System.out.println("Compound Interest is : " + compoundInterest);
    }
}
