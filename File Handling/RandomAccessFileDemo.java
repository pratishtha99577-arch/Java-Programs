import java.io.RandomAccessFile;
import java.io.IOException;

public class RandomAccessFileDemo {

    public static void main(String[] args) {

        try {

            // Creating RandomAccessFile object
            RandomAccessFile file =
                    new RandomAccessFile("MyFile.txt", "rw");


            // Writing data into file
            file.writeUTF("Hello Java RandomAccessFile");


            // Moving file pointer to beginning
            file.seek(0);


            // Reading data from file
            String data = file.readUTF();


            System.out.println("Data in file:");
            System.out.println(data);


            // Closing file
            file.close();

        }

        catch (IOException e) {

            System.out.println("Error while accessing file.");
            System.out.println(e.getMessage());
        }
    }
}