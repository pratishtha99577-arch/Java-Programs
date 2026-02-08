public class EvenCheck {
    public static void main(String[] args) {

        int num = 10;

        if (isEven(num))
            System.out.println(num + " is Even");
        else
            System.out.println(num + " is Odd");
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
