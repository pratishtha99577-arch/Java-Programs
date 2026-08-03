import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyDemo {

    public static void main(String[] args) {

        try {

            // Source file
            FileReader fr = new FileReader("source.txt");

            // Destination file
            FileWriter fw = new FileWriter("destination.txt");

            int ch;

            // Copy contents from source to destination
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }

            fr.close();
            fw.close();

            System.out.println("File copied successfully.");

        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}