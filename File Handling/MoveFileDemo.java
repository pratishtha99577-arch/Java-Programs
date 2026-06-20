import java.io.File;

public class MoveFileDemo {

    public static void main(String[] args) {

        // Source file path
        File oldFile = new File("MyFile.txt");

        // Destination file path
        File newFile = new File("NewFolder/MyFile.txt");


        // Moving file
        if (oldFile.renameTo(newFile)) {

            System.out.println("File moved successfully.");
            System.out.println("New Location: " + newFile.getPath());

        } else {

            System.out.println("File could not be moved.");
        }
    }
}