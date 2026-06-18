import java.io.File;
import java.util.Scanner;

public class FileOrDirectoryExists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file or directory path: ");
        String path = sc.nextLine();

        File f = new File(path);

        if (f.exists()) {
            if (f.isFile()) {
                System.out.println("The file exists.");
            } else if (f.isDirectory()) {
                System.out.println("The directory exists.");
            }
        } else {
            System.out.println("File or directory does not exist.");
        }

        sc.close();
    }
}