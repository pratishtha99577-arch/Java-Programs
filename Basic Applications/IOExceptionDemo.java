import java.io.FileReader;
import java.io.IOException;

public class IOExceptionDemo {

    public static void main(String[] args) {

        try {

            // Trying to open a file that does not exist
            FileReader file = new FileReader("sample.txt");

            System.out.println("File Opened Successfully.");

            file.close();
        }

        // Handling IOException
        catch (IOException e) {

            System.out.println("Error: Unable to open file.");
        }

        finally {

            System.out.println("Program Executed Successfully.");
        }
    }
}