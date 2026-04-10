import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine().toLowerCase();

        System.out.print("Enter character to find: ");
        char ch = sc.next().toLowerCase().charAt(0);

        int count = 0;
        int index = 0;

        while ((index = text.indexOf(ch, index)) != -1) {
            count++;
            index++;
        }

        System.out.println("Occurrences: " + count);
    }
}