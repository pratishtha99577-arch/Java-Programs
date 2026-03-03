//find the 1st & last occurance of an element in string.

public class FirstAndLastOccurrenceUsingRecursion {
    public static int first = -1;
    public static int last = -1;

    public static void findOccurance(String str, int idx, char elemenet) {
        if(idx == str.length()) {
            System.out.println("First occurance: " + first);
            System.out.println("Last occurance: " + last);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == elemenet) {
            if(first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }

        findOccurance(str, idx+1, elemenet);
    }

    public static void main(String[] args) {
        String str = "abaacdaefaah";
        findOccurance(str, 0, 'a');
    }   

}

//complexity: O(n)