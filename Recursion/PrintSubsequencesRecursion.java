//print all the subsequences of a string 

public class PrintSubsequencesRecursion {
    public static void subsequences(String str, int idx, String newString) {
        //base case
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }

        //include the character
        char currChar = str.charAt(idx);
        subsequences(str, idx + 1, newString + currChar);

        //exclude the character
        subsequences(str, idx + 1, newString);
    }

    public static void main(String[] args) {
        String str = "abc";
        subsequences(str, 0, "");
    }

}

//complexity = O(2^n)