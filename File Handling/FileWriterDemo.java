import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

    public static void main(String[] args) {

        try {

            // Creating FileWriter object
            FileWriter fw = new FileWriter("MyFile.txt");

            // Writing data into file
            fw.write("Hello, this is a Java FileWriter example.\n");
            fw.write("This data is written into a file.");

            // Closing file
            fw.close();

            System.out.println("Data written into file successfully.");

        }

        catch (IOException e) {

            System.out.println("Error while writing file.");
            System.out.println(e.getMessage());
        }
    }
}