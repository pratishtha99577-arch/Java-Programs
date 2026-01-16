import java.util.*;

public class SumUptoNForLoop {
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum = sum + i;
        }

        System.out.println(sum);
    }


    
}
