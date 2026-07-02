import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSenderDemo {

    public static void main(String[] args) {

        try {

            // Message to send
            String message = "Hello from UDP Sender";

            // Convert message to byte array
            byte[] data = message.getBytes();

            // Destination host and port
            InetAddress host = InetAddress.getByName("localhost");
            int port = 5000;

            // Create Datagram Packet
            DatagramPacket packet = new DatagramPacket(
                    data,
                    data.length,
                    host,
                    port
            );

            // Create Datagram Socket
            DatagramSocket socket = new DatagramSocket();

            // Send packet
            socket.send(packet);

            System.out.println("UDP Packet Sent Successfully.");
            System.out.println("Message: " + message);

            // Close socket
            socket.close();

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}