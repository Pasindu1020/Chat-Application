package chatapp;

import java.io.*;
import java.net.*;
import java.util.*;

public class ChatServer {

    // HashMap to store active clients and their handlers
    private static HashMap<String, ClientHandler> clients = new HashMap<>(); 

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            System.out.println("Server started on port 12345");

            while (true) {
                Socket clientSocket = serverSocket.accept();  // Accept client connection
                DataInputStream dis = new DataInputStream(clientSocket.getInputStream());
                String userName = dis.readUTF();  // First message from client is username

                // Create a client handler for each client
                ClientHandler clientHandler = new ClientHandler(clientSocket, userName);
                synchronized (clients) {
                    clients.put(userName, clientHandler);  // Add client to the list
                }
                
                new Thread(clientHandler).start();  // Start client handler thread
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Sends a message from the sender to a specific receiver (one-on-one)
    public static synchronized void sendMessageToUser(String receiver, String message, String sender) throws IOException {
        ClientHandler clientHandler = clients.get(receiver);
        if (clientHandler != null) {
            clientHandler.sendMessage(sender + ": " + message); // Send message to receiver
        }
    }

    // Sends a message to all clients except the sender (group chat)
    public static synchronized void sendGroupMessage(String message, String sender) throws IOException {
        for (Map.Entry<String, ClientHandler> client : clients.entrySet()) {
            client.getValue().sendMessage("GROUP|" + sender + ": " + message);  // Send group message to all users
        }
    }
}

class ClientHandler implements Runnable {
    private Socket socket;
    private String userName;
    private DataInputStream dis;
    private DataOutputStream dos;

    // ClientHandler constructor (unchanged)
    public ClientHandler(Socket socket, String userName) {
        this.socket = socket;
        this.userName = userName;
        try {
            this.dis = new DataInputStream(socket.getInputStream());
            this.dos = new DataOutputStream(socket.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        String received;
        while (true) {
            try {
                // Read incoming messages: "USER|receiver|message" or "GROUP|message"
                received = dis.readUTF();
                
                if (received.startsWith("USER")) {  // For one-on-one chat
                    String[] parts = received.split("\\|");
                    String receiver = parts[1];
                    String message = parts[2];
                    ChatServer.sendMessageToUser(receiver, message, userName);  // Handle one-on-one chat
                    
                } else if (received.startsWith("GROUP")) {  // For group chat
                    String[] parts = received.split("\\|");
                    String message = parts[1];
                    ChatServer.sendGroupMessage(message, userName);  // Handle group chat
                }
            } catch (IOException e) {
                e.printStackTrace();
                break;
            }
        }
        try {
            this.socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to send message to the client
    public void sendMessage(String message) throws IOException {
        dos.writeUTF(message);  // Send message to client
    }
}
