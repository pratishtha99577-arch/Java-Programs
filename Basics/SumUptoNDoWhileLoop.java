import java.util.*;

public class SumUptoNDoWhileLoop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        int sum = 0;      
        int i = 0;
        do{
            sum = sum + i;
            i++;
        }while(i<=n);

        System.out.println(sum)
    }
}    