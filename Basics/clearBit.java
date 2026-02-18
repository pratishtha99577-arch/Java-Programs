import java.util.*;

public class clearBit {
    public static void main(String args[]){
        int n = 5; // 0101 in binary
        int pos = 2; 
        int bitMask = 1<<pos;
        int notBitMask = ~(bitMask);
        
        int newNumber = notBitMask & n;
        System.out.println(newNumber);
    }
}    
