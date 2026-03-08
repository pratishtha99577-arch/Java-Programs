//print all the unique subsequences of a string

import java.util.HashSet;

public class UniqueSubsequencesRecursion {
    public static void subsequences(String str, int idx, String newString, HashSet<String> set) {
        //base case
        if (idx == str.length()) {
            if (set.contains(newString)) {
                return;
            }else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

        //include the character
        char currChar = str.charAt(idx);
        subsequences(str, idx + 1, newString + currChar, set);

        //exclude the character
        subsequences(str, idx + 1, newString, set);
    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subsequences(str, 0, "", set);
    }

}

//complexity = O(2^n)
