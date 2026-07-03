import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceiverDemo {

    public static void main(String[] args) {

        try {

            // Create DatagramSocket on port 5000
            DatagramSocket socket = new DatagramSocket(5000);

            // Buffer to store received data
            byte[] buffer = new byte[1024];

            // Create DatagramPacket
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

            System.out.println("Waiting to receive UDP packet...");

            // Receive packet
            socket.receive(packet);

            // Convert received data to String
            String message = new String(packet.getData(), 0, packet.getLength());

            System.out.println("UDP Packet Received Successfully.");
            System.out.println("Message: " + message);

            // Close socket
            socket.close();

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}