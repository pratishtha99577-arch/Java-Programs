import java.io.FileReader;
import java.io.IOException;

// Reader class
class Reader {

    private char targetCharacter;
    private int count = 0;

    // Constructor accepts the character to count
    Reader(char targetCharacter) {
        this.targetCharacter = targetCharacter;
    }

    // Read the file and count the character
    public void read(String fileName) throws IOException {

        FileReader file = new FileReader(fileName);

        int ch;

        while ((ch = file.read()) != -1) {

            if ((char) ch == targetCharacter) {
                count++;
            }
        }

        file.close();
    }

    // Return the count
    public int getCount() {
        return count;
    }
}


// Main class
public class ReaderDemo {

    public static void main(String[] args) {

        try {

            // Create Reader object to count character 'e'
            Reader reader = new Reader('e');

            // Read the file
            reader.read("sample.txt");

            // Display result
            System.out.println(
                "Character 'e' was read " +
                reader.getCount() +
                " times."
            );

        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}