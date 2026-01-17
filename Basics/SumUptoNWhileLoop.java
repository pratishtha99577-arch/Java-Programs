import java.util.*;

public class SumUptoNWhileLoop {
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        int i = 0;
        while(i <= n){
            sum = sum + i;
            i++;
        }

        System.out.println(sum);
    }


    
}
 
    

