public class PrimeNumberUsingFunction {
    public static void main(String[] args) {

        int num = 17;

        if (isPrime(num))
            System.out.println(num + " is a Prime number");
        else
            System.out.println(num + " is NOT a Prime number");
    }

    static boolean isPrime(int n) {

        if (n <= 1)
            return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
}
