package Users;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ChatClient {

    private Socket socket;
    private DataInputStream dis;
    private DataOutputStream dos;
    private JPanel pasinduPanel;
    private JPanel lourdesPanel;
    private JPanel isheniPanel;
    private JPanel vimeshPanel;
    private JPanel pramudiPanel;
    private JPanel groupChatPanel;

    public ChatClient(String userName, JPanel pasinduPanel, JPanel lourdesPanel, JPanel isheniPanel, JPanel vimeshPanel, JPanel pramudiPanel, JPanel groupChatPanel) {
        this.pasinduPanel = pasinduPanel;
        this.lourdesPanel = lourdesPanel;
        this.isheniPanel = isheniPanel;
        this.vimeshPanel = vimeshPanel;
        this.pramudiPanel = pramudiPanel;
        this.groupChatPanel = groupChatPanel;

        try {
            this.socket = new Socket("localhost", 12345);  // Connect to server
            this.dis = new DataInputStream(socket.getInputStream());
            this.dos = new DataOutputStream(socket.getOutputStream());
            dos.writeUTF(userName);  // Send username to server
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendMessageToUser(String receiver, String message) {
        try {
            dos.writeUTF("USER|" + receiver + "|" + message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendGroupMessage(String message) {
        try {
            dos.writeUTF("GROUP|" + message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to add a message bubble to the panel
    public void addMessageToPanel(JPanel panel, String message) {
        // Create the message bubble (JLabel) for the chat
        JLabel messageBubble = new JLabel(message);
        messageBubble.setOpaque(true);

        // Set background color for receiver
        messageBubble.setBackground(new Color(4, 255, 255));  
        messageBubble.setForeground(Color.BLACK);

        // Set padding inside the message bubble
        messageBubble.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));  // Padding inside the bubble

        // Set rounded corners for the message bubble using LineBorder with rounded edges
        messageBubble.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(160, 160, 160), 1, true), // Outer border with rounded corners
                BorderFactory.createEmptyBorder(10, 10, 10, 10) // Padding around the bubble
        ));

        // Create a container JPanel for the message bubble with BorderLayout
        JPanel container = new JPanel(new BorderLayout());

        // Add margins between messages (top, left, bottom, right)
        container.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));  // Spacing between messages

        // Align the message to the left (receiver)
        container.add(messageBubble, BorderLayout.WEST);  // Left-align for receiver

        // Add the message container to the chat panel
        panel.add(container);
        panel.revalidate();
        panel.repaint();
    }

    public void listenForMessages() {
        new Thread(() -> {
            try {
                String message;
                while ((message = dis.readUTF()) != null) {
                    if (message.startsWith("GROUP|")) {
                        // Extract the group message and add it to the group chat panel
                        String groupMessage = message.split("\\|", 2)[1];
                        // Append the received group message to the group chat panel
                        addMessageToPanel(groupChatPanel, groupMessage);  // Align to the left for receiver

                    } else {
                        // Handle one-on-one messages
                        String sender = message.split(":")[0];
                        String text = message.split(":", 2)[1];
                        switch (sender) {
                            case "Pasindu Harshamal":
                                addMessageToPanel(pasinduPanel, text); 
                                break;
                            case "Lourdes Shenuka":
                                addMessageToPanel(lourdesPanel, text);
                                break;
                            case "Isheni Thamel":
                                addMessageToPanel(isheniPanel, text);
                                break;
                            case "Vimesh Gunasekaran":
                                addMessageToPanel(vimeshPanel, text);
                                break;
                            case "Pramudi Premarathna":
                                addMessageToPanel(pramudiPanel, text);
                                break;
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
