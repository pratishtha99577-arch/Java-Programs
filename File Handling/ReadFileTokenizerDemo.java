import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ReadFileTokenizerDemo {

    public static void main(String[] args) {

        try {

            // Creating FileReader object
            FileReader fr = new FileReader("MyFile.txt");

            String content = "";
            int ch;

            // Reading file contents
            while ((ch = fr.read()) != -1) {
                content = content + (char) ch;
            }

            fr.close();

            System.out.println("File Contents:");
            System.out.println(content);


            // Breaking contents using StringTokenizer
            StringTokenizer st =
                    new StringTokenizer(content);

            System.out.println("\nWords in File:");

            while (st.hasMoreTokens()) {

                System.out.println(st.nextToken());
            }

        }

        catch (IOException e) {

            System.out.println("Error while reading file.");
            System.out.println(e.getMessage());
        }
    }
}