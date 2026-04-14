import java.util.Scanner;

public class SubstringCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter prefix to check: ");
        String prefix = sc.nextLine();

        System.out.print("Enter suffix to check: ");
        String suffix = sc.nextLine();

        String sub = str.substring(start, end);

        System.out.println("Substring: " + sub);
        System.out.println("Starts with \"" + prefix + "\": " + str.startsWith(prefix));
        System.out.println("Ends with \"" + suffix + "\": " + str.endsWith(suffix));
    }
}