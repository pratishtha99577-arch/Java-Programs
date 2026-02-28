// print x^n ( Stack height = logn )

public class PowerUsingRecursionOptimized {
    public static int calcPower(int x, int n) {
        //base cases
        if(n == 0) {  // base case 1
            return 1;
        }
        if(x == 0) {  // base case 2
            return 0;
        }

        //if n is even 
        if(n % 2 == 0) {
            return calcPower(x, n / 2) * calcPower(x, n / 2);
        } else {  // if n is odd
            return calcPower(x, n / 2) * calcPower(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int result = calcPower(x, n);
        System.out.println(x + " raised to the power " + n + " is: " + result);
    }

}