import java.util.*;

public class updateBit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        //oper=1 : set oper=0 : clear
        int n = 5; // 0101 in binary -> 0111 -> dec 7
        int pos =1;
        int bitMask = 1<<pos;

        if(oper == 1){
           //set oper
           int newNumber = bitMask | n;
           System.out.println(newNumber);
        } else {
           //clear oper
           int newBitMask = ~(bitMask);
           int newNumber = newBitMask & n;
           System.out.println(newNumber);
        }
    }
}           

        
        
