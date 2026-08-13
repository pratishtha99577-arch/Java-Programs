import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Wc {

    public static void main(String[] args) {

        // Check whether file name is provided
        if (args.length == 0) {
            System.out.println("Please provide a text file name.");
            System.out.println("Example: java Wc sample.txt");
            return;
        }

        String fileName = args[0];

        int characters = 0;
        int words = 0;
        int lines = 0;

        try {

            BufferedReader reader = new BufferedReader(
                    new FileReader(fileName));

            String line;

            while ((line = reader.readLine()) != null) {

                // Every row, including empty rows, is counted as a line
                lines++;

                // Count all characters including spaces
                characters += line.length();

                // Count words
                String trimmedLine = line.trim();

                if (!trimmedLine.isEmpty()) {

                    String[] wordArray = trimmedLine.split("\\s+");

                    words += wordArray.length;
                }
            }

            reader.close();

            System.out.println("========== WORD COUNT ==========");
            System.out.println("File       : " + fileName);
            System.out.println("Characters : " + characters);
            System.out.println("Words      : " + words);
            System.out.println("Lines      : " + lines);
            System.out.println("================================");

        } catch (IOException e) {

            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}