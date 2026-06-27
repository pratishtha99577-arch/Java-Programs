import java.io.File;

public class FileLengthDemo {

    public static void main(String[] args) {

        // Creating file object
        File file = new File("MyFile.txt");

        // Checking file existence
        if (file.exists()) {

            // Getting file length
            long length = file.length();

            System.out.println("File Name: " + file.getName());
            System.out.println("File Length: " + length + " bytes");

        } 
        else {

            System.out.println("File does not exist.");
        }
    }
}