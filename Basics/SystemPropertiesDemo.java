import java.util.Properties;

public class SystemPropertiesDemo {

    public static void main(String[] args) {

        // Get all system properties
        Properties properties = System.getProperties();

        // Display all system properties
        System.out.println("System Properties:\n");

        properties.list(System.out);
    }
}