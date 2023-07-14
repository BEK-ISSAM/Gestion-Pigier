package loginform;

import db.userConnection;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Register extends javax.swing.JFrame {

        String nom;
        String id;
        String tel;
        String mail;
        String mps;
        String cfmps;
        
    public Register() {
        initComponents();
        
        Border borderPanel = BorderFactory.createMatteBorder(5, 5, 5, 5, new Color(61, 89, 171));
        jLabel2.setBorder(borderPanel);
        Border borderTextField = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        NOM.setBorder(borderTextField);
        IDENTIFIANT.setBorder(borderTextField);
        TEL.setBorder(borderTextField);
        MAIL.setBorder(borderTextField);
        MPS.setBorder(borderTextField);
        CFMPS.setBorder(borderTextField);
        this.setResizable(false);
        
        //Close and Minimize Buttons at the top right corner of the frame
        Border borderLabel = BorderFactory.createMatteBorder(0, 0, 0, 0, Color.white);
        registerClose.setBorder(borderLabel);
        registerMinimize.setBorder(borderLabel);
        }

        public void addplaceholderStyle(JTextField textField){
        
        Font font = textField.getFont();
        font = font.deriveFont(Font.ITALIC);
        textField.setFont(font);
        textField.setForeground(Color.gray);//font color
        }
        
         public void removeplaceholderStyle(JTextField textField){
        
        Font font = textField.getFont();
        font = font.deriveFont(Font.PLAIN|Font.BOLD) ;
        textField.setFont(font);
        textField.setForeground(Color.BLACK);//font color
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        NOM = new javax.swing.JTextField();
        IDENTIFIANT = new javax.swing.JTextField();
        TEL = new javax.swing.JTextField();
        MAIL = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        MPS = new javax.swing.JPasswordField();
        CFMPS = new javax.swing.JPasswordField();
        registerClose = new javax.swing.JLabel();
        registerMinimize = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginform/Capture d’écran 2023-07-05 172529.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Inscription");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 153));
        jLabel3.setText("Nom complet:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 153));
        jLabel4.setText("Identifiant:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 153));
        jLabel5.setText("Tél:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 153));
        jLabel6.setText("Mail:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 153));
        jLabel7.setText("C.F.M.P:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 153));
        jLabel8.setText("Mot de passe:");

        NOM.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        NOM.setForeground(new java.awt.Color(153, 153, 153));
        NOM.setText("ENTRER VOTRE NOM COMPLET...");
        NOM.setToolTipText("");
        NOM.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NOMFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                NOMFocusLost(evt);
            }
        });
        NOM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOMActionPerformed(evt);
            }
        });

        IDENTIFIANT.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        IDENTIFIANT.setForeground(new java.awt.Color(153, 153, 153));
        IDENTIFIANT.setText("CHOISIR VOTRE IDENTIFIANT...");
        IDENTIFIANT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                IDENTIFIANTFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                IDENTIFIANTFocusLost(evt);
            }
        });
        IDENTIFIANT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDENTIFIANTActionPerformed(evt);
            }
        });

        TEL.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        TEL.setForeground(new java.awt.Color(153, 153, 153));
        TEL.setText("ENTRER VOTRE TEL...");
        TEL.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TELFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TELFocusLost(evt);
            }
        });
        TEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TELActionPerformed(evt);
            }
        });

        MAIL.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        MAIL.setForeground(new java.awt.Color(153, 153, 153));
        MAIL.setText("ENTRER VOTRE MAIL...");
        MAIL.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                MAILFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                MAILFocusLost(evt);
            }
        });
        MAIL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MAILActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 153));
        jButton1.setText("S'INSCRIRE");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        MPS.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        MPS.setForeground(new java.awt.Color(153, 153, 153));
        MPS.setText("ENTRER VOTRE MOT DE PASSE...");
        MPS.setEchoChar('\u0000');
        MPS.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                MPSFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                MPSFocusLost(evt);
            }
        });
        MPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MPSActionPerformed(evt);
            }
        });

        CFMPS.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        CFMPS.setForeground(new java.awt.Color(153, 153, 153));
        CFMPS.setText("CONFIRMER VOTRE  MOT DE PASSE...");
        CFMPS.setEchoChar('\u0000');
        CFMPS.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CFMPSFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CFMPSFocusLost(evt);
            }
        });
        CFMPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CFMPSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(35, 35, 35)
                        .addComponent(NOM, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(IDENTIFIANT)
                            .addComponent(TEL)
                            .addComponent(MAIL)
                            .addComponent(MPS)
                            .addComponent(CFMPS, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE))))
                .addGap(0, 21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(225, 225, 225))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(NOM, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(IDENTIFIANT, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel5))
                    .addComponent(TEL, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel6))
                    .addComponent(MAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel8))
                    .addComponent(MPS, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel7))
                    .addComponent(CFMPS, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );

        registerClose.setBackground(new java.awt.Color(255, 0, 0));
        registerClose.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        registerClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registerClose.setText("X");
        registerClose.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        registerClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerCloseMouseExited(evt);
            }
        });

        registerMinimize.setBackground(new java.awt.Color(102, 102, 102));
        registerMinimize.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        registerMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registerMinimize.setText("-");
        registerMinimize.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        registerMinimize.setMaximumSize(new java.awt.Dimension(14, 29));
        registerMinimize.setMinimumSize(new java.awt.Dimension(14, 29));
        registerMinimize.setPreferredSize(new java.awt.Dimension(14, 29));
        registerMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerMinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerMinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerMinimizeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(614, 614, 614)
                        .addComponent(registerMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(registerClose, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(registerMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registerClose, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NOMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOMActionPerformed

    }//GEN-LAST:event_NOMActionPerformed

    private void IDENTIFIANTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDENTIFIANTActionPerformed

    }//GEN-LAST:event_IDENTIFIANTActionPerformed

    private void TELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TELActionPerformed
        tel = TEL.getText();
        System.out.println(tel);
    }//GEN-LAST:event_TELActionPerformed

    private void MAILActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MAILActionPerformed
        mail = MAIL.getText();
        System.out.println(mail);
    }//GEN-LAST:event_MAILActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        nom = NOM.getText();
        id = IDENTIFIANT.getText();
        mps = MPS.getText();
        boolean cf = CFMPS.getText().equals(MPS.getText())? true:false;
        
        if(cf){
            userConnection.connect();
            String query = "INSERT INTO users VALUES ('" + id + "', '" + nom + "', '" + mps + "')";
            userConnection.insertIntoUsers(query);
            userConnection.closeConnection();
        }
        else{
            JOptionPane.showMessageDialog(this, "Echec de confitmation du mot de passe", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void NOMFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NOMFocusGained
        if(NOM.getText().equals("ENTRER VOTRE NOM COMPLET..."))
        {
            NOM.setText("");
            NOM.setForeground(Color.BLACK);
        }
        
    }//GEN-LAST:event_NOMFocusGained

    private void NOMFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NOMFocusLost
        if(NOM.getText().equals(""))
        {
            NOM.setText("ENTRER VOTRE NOM COMPLET...");
            NOM.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_NOMFocusLost

    private void IDENTIFIANTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IDENTIFIANTFocusGained
         if(IDENTIFIANT.getText().equals("CHOISIR VOTRE IDENTIFIANT..."))
        {
            IDENTIFIANT.setText("");
            IDENTIFIANT.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_IDENTIFIANTFocusGained

    private void IDENTIFIANTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IDENTIFIANTFocusLost
         if(IDENTIFIANT.getText().equals(""))
        {
            IDENTIFIANT.setText("CHOISIR VOTRE IDENTIFIANT...");
            IDENTIFIANT.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_IDENTIFIANTFocusLost

    private void TELFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TELFocusGained
        if(TEL.getText().equals("ENTRER VOTRE TEL..."))
        {
            TEL.setText("");
            TEL.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_TELFocusGained

    private void TELFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TELFocusLost
       if(TEL.getText().equals(""))
        {
            TEL.setText("ENTRER VOTRE TEL...");
            TEL.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_TELFocusLost

    private void MAILFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MAILFocusGained
        if(MAIL.getText().equals("ENTRER VOTRE MAIL..."))
        {
            MAIL.setText("");
            MAIL.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_MAILFocusGained

    private void MAILFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MAILFocusLost
       if(MAIL.getText().equals(""))
        {
            MAIL.setText("ENTRER VOTRE MAIL...");
            MAIL.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_MAILFocusLost

    private void MPSFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MPSFocusGained
         if(MPS.getText().equals("ENTRER VOTRE MOT DE PASSE..."))
        {
            MPS.setText("");
            MPS.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_MPSFocusGained

    private void MPSFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MPSFocusLost
         if(MPS.getText().equals(""))
        {
            MPS.setText("ENTRER VOTRE MOT DE PASSE...");
            MPS.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_MPSFocusLost

    private void CFMPSFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CFMPSFocusGained
          if(CFMPS.getText().equals("CONFIRMER VOTRE  MOT DE PASSE..."))
        {
            CFMPS.setText("");
            CFMPS.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_CFMPSFocusGained

    private void CFMPSFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CFMPSFocusLost
        if(CFMPS.getText().equals(""))
        {
            CFMPS.setText("CONFIRMER VOTRE  MOT DE PASSE...");
            CFMPS.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_CFMPSFocusLost

    private void registerMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMinimizeMouseExited
        Border borderLabel = BorderFactory.createMatteBorder(0,0,0,0, Color.WHITE);
        registerMinimize.setBorder(borderLabel);
        registerMinimize.setOpaque(false);
    }//GEN-LAST:event_registerMinimizeMouseExited

    private void registerMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMinimizeMouseEntered
        Border borderLabel = BorderFactory.createMatteBorder(0,0,0,0, Color.BLACK);
        registerMinimize.setBorder(borderLabel);
        registerMinimize.setBackground(new Color(100,100,100));
        registerMinimize.setForeground(Color.BLACK);
        registerMinimize.setOpaque(true);
    }//GEN-LAST:event_registerMinimizeMouseEntered

    private void registerMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMinimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_registerMinimizeMouseClicked

    private void MPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MPSActionPerformed

    }//GEN-LAST:event_MPSActionPerformed

    private void CFMPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CFMPSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CFMPSActionPerformed

    private void registerCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerCloseMouseExited
        Border borderLabel = BorderFactory.createMatteBorder(0,0,0,0, Color.GRAY);
        registerClose.setBorder(borderLabel);
        registerClose.setOpaque(false);
    }//GEN-LAST:event_registerCloseMouseExited

    private void registerCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerCloseMouseEntered
        Border borderLabel = BorderFactory.createMatteBorder(0,0,0,0, Color.RED);
        registerClose.setBorder(borderLabel);
        registerClose.setBackground(Color.RED);
        registerClose.setForeground(Color.BLACK);
        registerClose.setOpaque(true);
    }//GEN-LAST:event_registerCloseMouseEntered

    private void registerCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_registerCloseMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        userConnection.connect();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField CFMPS;
    private javax.swing.JTextField IDENTIFIANT;
    private javax.swing.JTextField MAIL;
    private javax.swing.JPasswordField MPS;
    private javax.swing.JTextField NOM;
    private javax.swing.JTextField TEL;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel registerClose;
    private javax.swing.JLabel registerMinimize;
    // End of variables declaration//GEN-END:variables
}
