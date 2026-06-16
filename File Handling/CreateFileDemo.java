import java.io.File;
import java.io.IOException;

public class CreateFileDemo {

    public static void main(String[] args) {

        try {

            // Creating a file object
            File file = new File("MyFile.txt");

            // Creating the file
            if (file.createNewFile()) {
                System.out.println("File created successfully.");
                System.out.println("File Name: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

        } catch (IOException e) {

            System.out.println("An error occurred while creating the file.");
            System.out.println(e.getMessage());
        }
    }
}