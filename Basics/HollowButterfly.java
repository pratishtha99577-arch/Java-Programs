import java.util.Scanner;

public class HollowButterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        // Upper half
        for (int i = 1; i <= n; i++) {

            // Left wing
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            // Middle spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right wing
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }

        // Lower half
        for (int i = n; i >= 1; i--) {

            // Left wing
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            // Middle spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right wing
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }

        sc.close();
    }
}
