import java.util.*;

public class CheckBit {
    //get bit
    public static void main(String args[]){
        int n = 5; // 0101 in binary
        //int pos = 2; // we want to check bit at position 2
        int pos = 3; // we want to check bit at position 3
        int bitMask = 1<<pos;

        if((bitMask & n) == 0){
            System.out.println("Bit was zero");
        } else {
            System.out.println("Bit was one");
        }
    }
}
