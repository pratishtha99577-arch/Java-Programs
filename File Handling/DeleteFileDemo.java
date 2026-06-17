import java.io.File;

public class DeleteFileDemo {

    public static void main(String[] args) {

        // File to be deleted
        File file = new File("MyFile.txt");

        // Deleting the file
        if (file.delete()) {

            System.out.println("File deleted successfully.");
            System.out.println("Deleted File: " + file.getName());

        } else {

            System.out.println("File not found or could not be deleted.");
        }
    }
}