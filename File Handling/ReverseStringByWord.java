import java.util.Scanner;

public class ReverseStringByWord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Splitting string into words
        String words[] = str.split(" ");

        String reverse = "";

        // Reversing words
        for (int i = words.length - 1; i >= 0; i--) {

            reverse = reverse + words[i] + " ";
        }

        System.out.println("Original String: " + str);

        System.out.println("Reversed String: " + reverse);

        sc.close();
    }
}