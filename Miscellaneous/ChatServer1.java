import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {

    public static void main(String[] args) {

        try {

            // Create Server Socket
            ServerSocket serverSocket = new ServerSocket(5000);

            System.out.println("==================================");
            System.out.println("       CHAT SERVER STARTED");
            System.out.println("==================================");
            System.out.println("Waiting for client connection...");

            // Accept client connection
            Socket socket = serverSocket.accept();

            System.out.println("Client Connected!");

            // Input stream from client
            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            // Output stream to client
            PrintWriter output = new PrintWriter(
                    socket.getOutputStream(), true);

            Scanner sc = new Scanner(System.in);

            while (true) {

                // Receive message from client
                String clientMessage = input.readLine();

                if (clientMessage == null || clientMessage.equalsIgnoreCase("exit")) {
                    System.out.println("Client disconnected.");
                    break;
                }

                System.out.println("Client: " + clientMessage);

                // Send reply to client
                System.out.print("Server: ");
                String serverMessage = sc.nextLine();

                output.println(serverMessage);

                if (serverMessage.equalsIgnoreCase("exit")) {
                    break;
                }
            }

            // Close resources
            sc.close();
            input.close();
            output.close();
            socket.close();
            serverSocket.close();

            System.out.println("Server Closed.");

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}