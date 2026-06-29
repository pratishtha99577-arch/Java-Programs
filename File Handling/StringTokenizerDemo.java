import java.util.StringTokenizer;

public class StringTokenizerDemo {

    public static void main(String[] args) {

        // Creating string
        String str = "Java is a programming language";

        // Creating StringTokenizer object
        StringTokenizer st = new StringTokenizer(str);

        System.out.println("Original String:");
        System.out.println(str);

        System.out.println("\nTokens are:");

        // Displaying each token
        while (st.hasMoreTokens()) {

            System.out.println(st.nextToken());
        }
    }
}