package Users;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class UserPramudi extends javax.swing.JFrame {

    private ChatClient chatClient;

    public UserPramudi() {
        initComponents();

        // Initialize chat client with map of text areas
        chatClient = new ChatClient("Pramudi Premarathna", pasinduPanel, lourdesPanel, isheniPanel, vimeshPanel, pramudiPanel, groupChatPanel);
        chatClient.listenForMessages();

        pasinduPanel.setLayout(new BoxLayout(pasinduPanel, BoxLayout.Y_AXIS));
        isheniPanel.setLayout(new BoxLayout(isheniPanel, BoxLayout.Y_AXIS));
        vimeshPanel.setLayout(new BoxLayout(vimeshPanel, BoxLayout.Y_AXIS));
        lourdesPanel.setLayout(new BoxLayout(lourdesPanel, BoxLayout.Y_AXIS));
        groupChatPanel.setLayout(new BoxLayout(groupChatPanel, BoxLayout.Y_AXIS));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BtnChat = new javax.swing.JButton();
        BtnProfile = new javax.swing.JButton();
        BtnGroupChat = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelChat = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanelDefault = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPanelUser2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButtonSend = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        isheniPanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanelUser4 = new javax.swing.JPanel();
        messageTextField = new javax.swing.JTextField();
        sendButton = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        recipientLabel = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        pasinduPanel = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanelUser3 = new javax.swing.JPanel();
        messageTextField2 = new javax.swing.JTextField();
        sendButton2 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        recipientLabel2 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lourdesPanel = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanelUser5 = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jButtonSend4 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        vimeshPanel = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanelUser6 = new javax.swing.JPanel();
        jTextField7 = new javax.swing.JTextField();
        jButtonSend5 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        pramudiPanel = new javax.swing.JPanel();
        jPanelGroupChat = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        groupChatPanel = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanelProfile = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pramudi Premaratna");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(33, 97, 140));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnChat.setBackground(new java.awt.Color(174, 214, 241));
        BtnChat.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        BtnChat.setForeground(new java.awt.Color(0, 51, 102));
        BtnChat.setText("Chat");
        BtnChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnChatActionPerformed(evt);
            }
        });
        jPanel1.add(BtnChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 240, 65));

        BtnProfile.setBackground(new java.awt.Color(174, 214, 241));
        BtnProfile.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        BtnProfile.setForeground(new java.awt.Color(0, 51, 102));
        BtnProfile.setText("My Profile");
        BtnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnProfileActionPerformed(evt);
            }
        });
        jPanel1.add(BtnProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 240, 65));

        BtnGroupChat.setBackground(new java.awt.Color(174, 214, 241));
        BtnGroupChat.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        BtnGroupChat.setForeground(new java.awt.Color(0, 51, 102));
        BtnGroupChat.setText("Group Chat");
        BtnGroupChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGroupChatActionPerformed(evt);
            }
        });
        jPanel1.add(BtnGroupChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 240, 65));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Cancel.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, -1, -1));
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 74, -1, -1));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Appicon.png"))); // NOI18N
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 770));

        jPanelChat.setBackground(new java.awt.Color(204, 204, 204));
        jPanelChat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(52, 152, 219));
        jPanel2.setPreferredSize(new java.awt.Dimension(410, 800));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(52, 152, 219));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Untitled-4.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel8.setText("Pramudi Premaratna (You)");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(35, 35, 35))
        );

        jPanel6.setBackground(new java.awt.Color(52, 152, 219));
        jPanel6.setPreferredSize(new java.awt.Dimension(386, 94));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Untitled-2.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel12.setText("Vimesh Gunasekaran");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(52, 152, 219));
        jPanel7.setPreferredSize(new java.awt.Dimension(386, 94));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel6.setText("Lourdes Shenuka");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Untitled.png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(52, 152, 219));
        jPanel8.setPreferredSize(new java.awt.Dimension(386, 94));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Untitled-1.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel5.setText("Isheni Thamel");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(129, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 4, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(52, 152, 219));
        jPanel9.setPreferredSize(new java.awt.Dimension(386, 94));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel9MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel7.setText("Pasindu Harshamal");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/mypic (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(87, 87, 87))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 5, Short.MAX_VALUE)
                .addComponent(jLabel3))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 213, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jPanelChat.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 410, 790));

        jPanelDefault.setBackground(new java.awt.Color(52, 152, 219));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Appicon.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel11.setText("<html><p align = center>\n Box </p>\n</html>");

        jLabel32.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel32.setText("<html><p align = center>Chater  </p>\n</html>");

        javax.swing.GroupLayout jPanelDefaultLayout = new javax.swing.GroupLayout(jPanelDefault);
        jPanelDefault.setLayout(jPanelDefaultLayout);
        jPanelDefaultLayout.setHorizontalGroup(
            jPanelDefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDefaultLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
            .addGroup(jPanelDefaultLayout.createSequentialGroup()
                .addGroup(jPanelDefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDefaultLayout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDefaultLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(189, Short.MAX_VALUE))
        );
        jPanelDefaultLayout.setVerticalGroup(
            jPanelDefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDefaultLayout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(380, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("tab1", jPanelDefault);

        jPanelUser2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jPanelUser2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 732, 331, 38));

        jButtonSend.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jButtonSend.setText("Send");
        jButtonSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSendActionPerformed(evt);
            }
        });
        jPanelUser2.add(jButtonSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 732, 135, 38));

        jPanel12.setBackground(new java.awt.Color(153, 204, 255));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel13.setText("Isheni Thamel");
        jPanel12.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Call.png"))); // NOI18N
        jPanel12.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, -1, 50));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Video Call.png"))); // NOI18N
        jPanel12.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, -1, 50));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Back.png"))); // NOI18N
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });
        jPanel12.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 50));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Untitled-1 (1).png"))); // NOI18N
        jPanel12.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        jPanelUser2.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 473, -1));

        isheniPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout isheniPanelLayout = new javax.swing.GroupLayout(isheniPanel);
        isheniPanel.setLayout(isheniPanelLayout);
        isheniPanelLayout.setHorizontalGroup(
            isheniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 471, Short.MAX_VALUE)
        );
        isheniPanelLayout.setVerticalGroup(
            isheniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 653, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(isheniPanel);

        jPanelUser2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 70, 473, 655));

        jTabbedPane2.addTab("tab2", jPanelUser2);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelUser4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        messageTextField.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jPanelUser4.add(messageTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 732, 331, 38));

        sendButton.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        sendButton.setText("Send");
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });
        jPanelUser4.add(sendButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 732, 135, 38));

        jPanel16.setBackground(new java.awt.Color(153, 204, 255));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        recipientLabel.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        recipientLabel.setText("Pasindu Harshamal");
        jPanel16.add(recipientLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, 30));

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Call.png"))); // NOI18N
        jPanel16.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, -1, 50));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Video Call.png"))); // NOI18N
        jPanel16.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, -1, 50));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Back.png"))); // NOI18N
        jLabel42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel42MouseClicked(evt);
            }
        });
        jPanel16.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 50));

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/mypic (1) 2.png"))); // NOI18N
        jPanel16.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        jPanelUser4.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 473, -1));

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pasinduPanel.setBackground(new java.awt.Color(255, 255, 255));
        pasinduPanel.setLayout(new javax.swing.BoxLayout(pasinduPanel, javax.swing.BoxLayout.LINE_AXIS));
        jScrollPane4.setViewportView(pasinduPanel);

        jPanelUser4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 70, 473, 655));

        jPanel4.add(jPanelUser4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane2.addTab("tab3", jPanel4);

        jPanelUser3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        messageTextField2.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jPanelUser3.add(messageTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 732, 331, 38));

        sendButton2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        sendButton2.setText("Send");
        sendButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButton2ActionPerformed(evt);
            }
        });
        jPanelUser3.add(sendButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 732, 135, 38));

        jPanel15.setBackground(new java.awt.Color(153, 204, 255));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        recipientLabel2.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        recipientLabel2.setText("Lourdes Shenuka");
        jPanel15.add(recipientLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, 30));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Call.png"))); // NOI18N
        jPanel15.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, -1, 50));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Video Call.png"))); // NOI18N
        jPanel15.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, -1, 50));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Back.png"))); // NOI18N
        jLabel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel37MouseClicked(evt);
            }
        });
        jPanel15.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 50));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Untitled 6.png"))); // NOI18N
        jPanel15.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        jPanelUser3.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 473, -1));

        lourdesPanel.setBackground(new java.awt.Color(255, 255, 255));
        lourdesPanel.setLayout(new javax.swing.BoxLayout(lourdesPanel, javax.swing.BoxLayout.LINE_AXIS));
        jScrollPane3.setViewportView(lourdesPanel);

        jPanelUser3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 70, 473, 655));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelUser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelUser3, javax.swing.GroupLayout.PREFERRED_SIZE, 831, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("tab4", jPanel5);

        jPanelUser5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField6.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jPanelUser5.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 732, 331, 38));

        jButtonSend4.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jButtonSend4.setText("Send");
        jButtonSend4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSend4ActionPerformed(evt);
            }
        });
        jPanelUser5.add(jButtonSend4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 732, 135, 38));

        jPanel17.setBackground(new java.awt.Color(153, 204, 255));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel44.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel44.setText("Vimesh Gunasekaran");
        jPanel17.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, 30));

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Call.png"))); // NOI18N
        jPanel17.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, -1, 50));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Video Call.png"))); // NOI18N
        jPanel17.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, -1, 50));

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Back.png"))); // NOI18N
        jLabel47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel47MouseClicked(evt);
            }
        });
        jPanel17.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 50));

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Untitled-2 mod.png"))); // NOI18N
        jPanel17.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        jPanelUser5.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 473, -1));

        vimeshPanel.setBackground(new java.awt.Color(255, 255, 255));
        vimeshPanel.setLayout(new javax.swing.BoxLayout(vimeshPanel, javax.swing.BoxLayout.LINE_AXIS));
        jScrollPane5.setViewportView(vimeshPanel);

        jPanelUser5.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 70, 473, 655));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 485, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelUser5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 831, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelUser5, javax.swing.GroupLayout.PREFERRED_SIZE, 831, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("tab5", jPanel10);

        jPanelUser6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField7.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jPanelUser6.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 732, 331, 38));

        jButtonSend5.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jButtonSend5.setText("Send");
        jButtonSend5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSend5ActionPerformed(evt);
            }
        });
        jPanelUser6.add(jButtonSend5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 732, 135, 38));

        jPanel18.setBackground(new java.awt.Color(153, 204, 255));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel49.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel49.setText("Pramudi Premaratna");
        jPanel18.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, 30));

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Call.png"))); // NOI18N
        jPanel18.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, -1, 50));

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Video Call.png"))); // NOI18N
        jPanel18.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, -1, 50));

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Back.png"))); // NOI18N
        jLabel52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel52MouseClicked(evt);
            }
        });
        jPanel18.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 50));

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Untitled-4 mod.png"))); // NOI18N
        jPanel18.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        jPanelUser6.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 473, -1));

        pramudiPanel.setBackground(new java.awt.Color(255, 255, 255));
        pramudiPanel.setLayout(new javax.swing.BoxLayout(pramudiPanel, javax.swing.BoxLayout.LINE_AXIS));
        jScrollPane6.setViewportView(pramudiPanel);

        jPanelUser6.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 70, 473, 655));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 485, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelUser6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 831, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelUser6, javax.swing.GroupLayout.PREFERRED_SIZE, 831, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("tab6", jPanel11);

        jPanelChat.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, -30, 480, 860));

        jTabbedPane1.addTab("tab1", jPanelChat);

        jPanelGroupChat.setBackground(new java.awt.Color(52, 152, 219));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        groupChatPanel.setLayout(new javax.swing.BoxLayout(groupChatPanel, javax.swing.BoxLayout.LINE_AXIS));
        jScrollPane1.setViewportView(groupChatPanel);

        jTextField2.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 102));
        jButton1.setText("Send");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel13.setBackground(new java.awt.Color(153, 204, 255));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Call.png"))); // NOI18N
        jPanel13.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 5, -1, 60));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Video Call.png"))); // NOI18N
        jPanel13.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 5, -1, 60));

        jLabel15.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 51, 102));
        jLabel15.setText("Shenuka, Pasindu, Isheni, Vimesh, Pramudi");
        jPanel13.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Group icon.png"))); // NOI18N
        jPanel13.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel17.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 51, 102));
        jLabel17.setText("Batch Toppers");
        jPanel13.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        javax.swing.GroupLayout jPanelGroupChatLayout = new javax.swing.GroupLayout(jPanelGroupChat);
        jPanelGroupChat.setLayout(jPanelGroupChatLayout);
        jPanelGroupChatLayout.setHorizontalGroup(
            jPanelGroupChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGroupChatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelGroupChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanelGroupChatLayout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5)))
                .addContainerGap())
        );
        jPanelGroupChatLayout.setVerticalGroup(
            jPanelGroupChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGroupChatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelGroupChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab2", jPanelGroupChat);

        jPanelProfile.setBackground(new java.awt.Color(153, 204, 255));

        jLabel18.setBackground(new java.awt.Color(0, 51, 102));
        jLabel18.setFont(new java.awt.Font("Rockwell", 1, 22)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 51, 102));
        jLabel18.setText("Bio");

        jLabel19.setBackground(new java.awt.Color(0, 51, 102));
        jLabel19.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 51, 102));
        jLabel19.setText("Pramudi Premarathna");

        jLabel20.setBackground(new java.awt.Color(0, 51, 102));
        jLabel20.setFont(new java.awt.Font("Rockwell", 1, 22)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 51, 102));
        jLabel20.setText("Interests");

        jLabel21.setBackground(new java.awt.Color(0, 51, 102));
        jLabel21.setFont(new java.awt.Font("MV Boli", 0, 20)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 51, 102));
        jLabel21.setText("<html>\n<p>\nDancing <br>\nMovies <br>\nReading <br>\nModeling <br>\nMusic\n</p>\n</html>");

        jLabel22.setBackground(new java.awt.Color(0, 51, 102));
        jLabel22.setFont(new java.awt.Font("MV Boli", 0, 20)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 51, 102));
        jLabel22.setText("Unapologetic");

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Profile Pramudi.png"))); // NOI18N

        javax.swing.GroupLayout jPanelProfileLayout = new javax.swing.GroupLayout(jPanelProfile);
        jPanelProfile.setLayout(jPanelProfileLayout);
        jPanelProfileLayout.setHorizontalGroup(
            jPanelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProfileLayout.createSequentialGroup()
                .addGroup(jPanelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelProfileLayout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jLabel23))
                    .addGroup(jPanelProfileLayout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(jLabel19))
                    .addGroup(jPanelProfileLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel20)))
                    .addGroup(jPanelProfileLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel22))
                    .addGroup(jPanelProfileLayout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(317, Short.MAX_VALUE))
        );
        jPanelProfileLayout.setVerticalGroup(
            jPanelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProfileLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addGap(34, 34, 34)
                .addComponent(jLabel18)
                .addGap(14, 14, 14)
                .addComponent(jLabel22)
                .addGap(49, 49, 49)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab3", jPanelProfile);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, -29, 890, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnChatActionPerformed
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_BtnChatActionPerformed

    private void BtnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnProfileActionPerformed
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_BtnProfileActionPerformed

    private void BtnGroupChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGroupChatActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_BtnGroupChatActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        jTabbedPane2.setSelectedIndex(1);
    }//GEN-LAST:event_jPanel8MouseClicked

    private void jPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseClicked
        jTabbedPane2.setSelectedIndex(2);
    }//GEN-LAST:event_jPanel9MouseClicked

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        jTabbedPane2.setSelectedIndex(3);
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        jTabbedPane2.setSelectedIndex(4);
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        //jTabbedPane2.setSelectedIndex(5);
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        jTabbedPane2.setSelectedIndex(0);
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        jTabbedPane2.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseClicked
        jTabbedPane2.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel37MouseClicked

    private void jLabel42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MouseClicked
        jTabbedPane2.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel42MouseClicked

    private void jLabel47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel47MouseClicked
        jTabbedPane2.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel47MouseClicked

    private void jLabel52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel52MouseClicked
        jTabbedPane2.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel52MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String message = jTextField2.getText();
        chatClient.sendGroupMessage(message);
        jTextField2.setText("");

    }//GEN-LAST:event_jButton1ActionPerformed


    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
        String receiver = "Pasindu Harshamal";
        String message = messageTextField.getText();
        chatClient.sendMessageToUser(receiver, message);
        addMessageToPanel(pasinduPanel, message);
        messageTextField.setText("");
    }//GEN-LAST:event_sendButtonActionPerformed

    private void jButtonSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSendActionPerformed
        String receiver = "Isheni Thamel";
        String message = jTextField1.getText();

        chatClient.sendMessageToUser(receiver, message);
        addMessageToPanel(isheniPanel, message);
        jTextField1.setText("");
    }//GEN-LAST:event_jButtonSendActionPerformed

    private void jButtonSend4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSend4ActionPerformed
        String receiver = "Vimesh Gunasekaran";
        String message = jTextField6.getText();

        chatClient.sendMessageToUser(receiver, message);
        addMessageToPanel(vimeshPanel, message);
        jTextField6.setText("");
    }//GEN-LAST:event_jButtonSend4ActionPerformed

    private void jButtonSend5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSend5ActionPerformed
        //
    }//GEN-LAST:event_jButtonSend5ActionPerformed

    private void sendButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButton2ActionPerformed
        String receiver = "Lourdes Shenuka";
        String message = messageTextField2.getText();

        chatClient.sendMessageToUser(receiver, message);
        addMessageToPanel(lourdesPanel, message);
        messageTextField2.setText("");
    }//GEN-LAST:event_sendButton2ActionPerformed

    public void addMessageToPanel(JPanel panel, String message) {
        // Create the message bubble (JLabel) for the chat
        JLabel messageBubble = new JLabel(message);
        messageBubble.setOpaque(true);

        // Set background color for sender
        messageBubble.setBackground(new Color(52, 135, 255)); 
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

        // Align the message to the right (sender)
        container.add(messageBubble, BorderLayout.EAST);  // Right-align for sender

        // Add the message container to the chat panel
        panel.add(container);
        panel.revalidate();
        panel.repaint();
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserPramudi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnChat;
    private javax.swing.JButton BtnGroupChat;
    private javax.swing.JButton BtnProfile;
    private javax.swing.JPanel groupChatPanel;
    private javax.swing.JPanel isheniPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonSend;
    private javax.swing.JButton jButtonSend4;
    private javax.swing.JButton jButtonSend5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelChat;
    private javax.swing.JPanel jPanelDefault;
    private javax.swing.JPanel jPanelGroupChat;
    private javax.swing.JPanel jPanelProfile;
    private javax.swing.JPanel jPanelUser2;
    private javax.swing.JPanel jPanelUser3;
    private javax.swing.JPanel jPanelUser4;
    private javax.swing.JPanel jPanelUser5;
    private javax.swing.JPanel jPanelUser6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JPanel lourdesPanel;
    private javax.swing.JTextField messageTextField;
    private javax.swing.JTextField messageTextField2;
    private javax.swing.JPanel pasinduPanel;
    private javax.swing.JPanel pramudiPanel;
    private javax.swing.JLabel recipientLabel;
    private javax.swing.JLabel recipientLabel2;
    private javax.swing.JButton sendButton;
    private javax.swing.JButton sendButton2;
    private javax.swing.JPanel vimeshPanel;
    // End of variables declaration//GEN-END:variables
}
