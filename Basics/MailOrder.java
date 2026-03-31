import java.util.Scanner;

public class MailOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int productNumber, quantity;
        double price = 0, total = 0;

        System.out.println("Enter product number (1-5) and quantity (0 to stop):");

        while (true) {
            System.out.print("Product Number: ");
            productNumber = sc.nextInt();

            if (productNumber == 0)
                break;

            System.out.print("Quantity: ");
            quantity = sc.nextInt();

            switch (productNumber) {
                case 1: price = 99.90; break;
                case 2: price = 20.20; break;
                case 3: price = 6.87; break;
                case 4: price = 45.50; break;
                case 5: price = 40.49; break;
                default:
                    System.out.println("Invalid product!");
                    continue;
            }

            total += price * quantity;
        }

        System.out.println("Total Retail Value: Rs. " + total);
    }
}