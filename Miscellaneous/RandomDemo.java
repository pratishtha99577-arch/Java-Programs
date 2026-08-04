import java.util.Random;

public class RandomDemo {

    public static void main(String[] args) {

        // Create Random object
        Random random = new Random();

        // Generate random integer (0 to 99)
        int randomInt = random.nextInt(100);

        // Generate random double (0.0 to 1.0)
        double randomDouble = random.nextDouble();

        // Generate random boolean
        boolean randomBoolean = random.nextBoolean();

        // Generate random float
        float randomFloat = random.nextFloat();

        // Generate random long
        long randomLong = random.nextLong();

        System.out.println("Random Integer (0-99): " + randomInt);
        System.out.println("Random Double: " + randomDouble);
        System.out.println("Random Boolean: " + randomBoolean);
        System.out.println("Random Float: " + randomFloat);
        System.out.println("Random Long: " + randomLong);
    }
}