public class OperatorEvaluation {
    public static void main(String[] args) {

        int x;

        x = 7 + 3 * 6 / 2 - 1;
        System.out.println("Value of x (1st expression): " + x);

        x = 2 % 2 + 2 * 2 - 2 / 2;
        System.out.println("Value of x (2nd expression): " + x);

        x = (3 * 9 * (3 + (9 * 3 / 3)));
        System.out.println("Value of x (3rd expression): " + x);
    }
}