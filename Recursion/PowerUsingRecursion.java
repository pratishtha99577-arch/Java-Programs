//Print x^n (Stack Height = n)

public class PowerUsingRecursion {
    public static int calcPower(int x, int n) {
        if(n == 0) {  //base case 1
            return 1;
        }
        if(x == 0) {  //base case 2
            return 0;
        }

        int xPownm1 = calcPower(x, n - 1);  //recursive call(work towards base case)
        int xPown = x * xPownm1; 
        return xPown;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int result = calcPower(x, n);
        System.out.println(x + " raised to the power " + n + " is: " + result);
    }

}
