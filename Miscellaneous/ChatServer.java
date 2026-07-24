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

            System.out.println("Server Started...");
            System.out.println("Waiting for Client...");

            // Accept Client Connection
            Socket socket = serverSocket.accept();

            System.out.println("Client Connected.");

            // Input and Output Streams
            BufferedReader clientInput = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            PrintWriter clientOutput = new PrintWriter(
                    socket.getOutputStream(), true);

            Scanner sc = new Scanner(System.in);

            while (true) {

                // Receive message from client
                String message = clientInput.readLine();

                if (message == null || message.equalsIgnoreCase("exit")) {
                    System.out.println("Client disconnected.");
                    break;
                }

                System.out.println("Client: " + message);

                // Reply to client
                System.out.print("Server: ");
                String reply = sc.nextLine();

                clientOutput.println(reply);

                if (reply.equalsIgnoreCase("exit")) {
                    break;
                }
            }

            sc.close();
            socket.close();
            serverSocket.close();

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}