import java.net.InetAddress;
import java.net.UnknownHostException;

public class HostNameDemo {

    public static void main(String[] args) {

        try {

            // Given IP address
            String ipAddress = "8.8.8.8";

            // Getting host name using IP address
            InetAddress address =
                    InetAddress.getByName(ipAddress);

            System.out.println("IP Address: " + ipAddress);

            System.out.println("Host Name: "
                    + address.getHostName());

        }

        catch (UnknownHostException e) {

            System.out.println("Host not found.");
        }
    }
}