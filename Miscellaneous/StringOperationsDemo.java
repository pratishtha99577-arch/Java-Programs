public class StringOperationsDemo {

    public static void main(String[] args) {

        // Creating Strings
        String str1 = "Java Programming";
        String str2 = "Language";

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // Length
        System.out.println("\nLength of String 1: " + str1.length());

        // Convert to Uppercase
        System.out.println("Uppercase: " + str1.toUpperCase());

        // Convert to Lowercase
        System.out.println("Lowercase: " + str1.toLowerCase());

        // Character at index
        System.out.println("Character at index 5: " + str1.charAt(5));

        // Substring
        System.out.println("Substring (5 to 16): " + str1.substring(5, 16));

        // Concatenation
        System.out.println("Concatenated String: " + str1.concat(" " + str2));

        // Compare Strings
        System.out.println("Compare with \"Java Programming\": "
                + str1.equals("Java Programming"));

        // Contains
        System.out.println("Contains \"Java\": " + str1.contains("Java"));

        // Starts With
        System.out.println("Starts with \"Java\": " + str1.startsWith("Java"));

        // Ends With
        System.out.println("Ends with \"ing\": " + str1.endsWith("ing"));

        // Index Of
        System.out.println("Index of 'P': " + str1.indexOf('P'));

        // Replace
        System.out.println("Replace 'Java' with 'Python': "
                + str1.replace("Java", "Python"));

        // Trim
        String str3 = "   Hello Java   ";
        System.out.println("Before Trim: \"" + str3 + "\"");
        System.out.println("After Trim: \"" + str3.trim() + "\"");
    }
}