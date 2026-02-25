public class FactorialUsingRecursion {
    public static int calcfactorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int fact_nm1 = calcfactorial(n - 1);
        int fact_n = n * fact_nm1;
        return fact_n;
    }
    public static void main(String[] args) {
        int n = 5;
        int factorial = calcfactorial(n);  //answer will be stored in factorial
        System.out.println("Factorial of " + n + " is: " + factorial);
    }
}
