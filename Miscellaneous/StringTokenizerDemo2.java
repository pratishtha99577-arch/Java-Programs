import java.util.StringTokenizer;

public class StringTokenizerDemo {

    public static void main(String[] args) {

        String str = "Java is a simple and powerful language";

        // Create StringTokenizer object
        StringTokenizer st = new StringTokenizer(str);

        System.out.println("Original String:");
        System.out.println(str);

        System.out.println("\nTokens:");

        // Display each token
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        // Display number of tokens
        System.out.println("\nTotal Number of Tokens: " + st.countTokens());
    }
}