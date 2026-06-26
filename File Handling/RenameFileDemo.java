import java.io.File;

public class RenameFileDemo {

    public static void main(String[] args) {

        // Old file name
        File oldFile = new File("MyFile.txt");

        // New file name
        File newFile = new File("NewFile.txt");


        // Renaming file
        if (oldFile.renameTo(newFile)) {

            System.out.println("File renamed successfully.");
            System.out.println("New File Name: " + newFile.getName());

        } else {

            System.out.println("File could not be renamed.");
        }
    }
}