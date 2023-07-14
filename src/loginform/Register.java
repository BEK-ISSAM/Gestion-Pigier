/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginform;

import db.userConnection;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.awt.Font;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


/**
 *
 * @author HP
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    
        String nom;
        String id;
        String tel;
        String mail;
        String mps;
        String cfmps;
        HashMap<String, String> textFields = new HashMap<>();

       
        
    public Register() {
        initComponents();
       /* textFields.add(nom);
        textFields.add(id);
        textFields.add(tel);
        textFields.add(mail);
        textFields.add(mps);
        textFields.add(cfmps);*/

        
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
        
        
        
        //close and minimize
        Border borderLabel = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
    jclose.setBorder(borderLabel);
    jminimize.setBorder(borderLabel);
     
        
       
        
        
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
        java.awt.GridBagConstraints gridBagConstraints;

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
        jclose = new javax.swing.JLabel();
        jminimize = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginform/Capture d’écran 2023-07-05 172529.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Inscription");

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 153));
        jLabel3.setText("Nom complet:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(31, 32, 0, 0);
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 153));
        jLabel4.setText("Identifiant:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(49, 32, 0, 0);
        jPanel1.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 153));
        jLabel5.setText("Tél:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(51, 32, 0, 0);
        jPanel1.add(jLabel5, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 153));
        jLabel6.setText("Mail:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(56, 32, 0, 0);
        jPanel1.add(jLabel6, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 153));
        jLabel7.setText("C.F.M.P:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 32, 0, 0);
        jPanel1.add(jLabel7, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 153));
        jLabel8.setText("Mot de passe:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 32, 0, 0);
        jPanel1.add(jLabel8, gridBagConstraints);

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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 337;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 15, 0, 15);
        jPanel1.add(NOM, gridBagConstraints);

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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 337;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(48, 15, 0, 15);
        jPanel1.add(IDENTIFIANT, gridBagConstraints);

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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 337;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(44, 15, 0, 15);
        jPanel1.add(TEL, gridBagConstraints);

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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 337;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(49, 15, 0, 15);
        jPanel1.add(MAIL, gridBagConstraints);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 153));
        jButton1.setText("INSCRIRE");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 69, 16, 0);
        jPanel1.add(jButton1, gridBagConstraints);

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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 337;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(49, 15, 0, 15);
        jPanel1.add(MPS, gridBagConstraints);

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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 337;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(49, 15, 0, 15);
        jPanel1.add(CFMPS, gridBagConstraints);

        jclose.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jclose.setText("X");
        jclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jcloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jcloseMouseExited(evt);
            }
        });

        jminimize.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jminimize.setText("-");
        jminimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jminimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jminimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jminimizeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(538, 538, 538)
                        .addComponent(jminimize, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jclose, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jminimize, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jclose))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NOMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOMActionPerformed

    }//GEN-LAST:event_NOMActionPerformed

    private void IDENTIFIANTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDENTIFIANTActionPerformed

    }//GEN-LAST:event_IDENTIFIANTActionPerformed

    private void TELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TELActionPerformed

    }//GEN-LAST:event_TELActionPerformed

    private void MAILActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MAILActionPerformed
        mail = MAIL.getText();
        System.out.println(mail);
    }//GEN-LAST:event_MAILActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        nom = NOM.getText();
        id = IDENTIFIANT.getText();
        mps = MPS.getText();
        mail = MAIL.getText();
        tel = TEL.getText();
        cfmps = CFMPS.getText();
        boolean cf = CFMPS.getText().equals(MPS.getText())? true:false;
        boolean isFieldEmpty = IDENTIFIANT.getText().isEmpty() || NOM.getText().isEmpty() || TEL.getText().isEmpty() || MAIL.getText().isEmpty() || MPS.getText().isEmpty() || CFMPS.getText().isEmpty();
        
        /*for(String s : textFields){
            if(s.isEmpty() || s.equals())
        }*/
        if(nom.isEmpty() || nom.equals("ENTRER VOTRE NOM COMPLET..."))
                JOptionPane.showMessageDialog(this, "NOM Text field cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
        if(id.isEmpty() || id.equals("CHOISIR VOTRE IDENTIFIANT..."))
                JOptionPane.showMessageDialog(this, "Id Text field cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
        if(tel.isEmpty() || tel.equals("ENTRER VOTRE TEL..."))
                JOptionPane.showMessageDialog(this, "Tel Text field cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
        if(mail.isEmpty() || mail.equals("ENTRER VOTRE MAIL..."))
                JOptionPane.showMessageDialog(this, "Mail Text field cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
        if(mps.isEmpty() || mps.equals("ENTRER VOTRE MOT DE PASSE..."))
                JOptionPane.showMessageDialog(this, "MOT DE PASSE Text field cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
        if(cfmps.isEmpty() || cfmps.equals("CONFIRMER VOTRE  MOT DE PASSE..."))
                JOptionPane.showMessageDialog(this, "CONFIRMATION Text field cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
        
        
        if(cf && !isFieldEmpty){

            userConnection.connect();
            String query = "INSERT INTO users (id, nom_complet, mot_de_passe, mail, tel) VALUES ('" + id + "', '" + nom + "', '" + mps + "','" + mail + "', '" + tel + "')";
            userConnection.insertIntoUsers(query);
            userConnection.closeConnection();
            
            login login1 = new login();
            login1.setVisible(true);
            login1.setLocationRelativeTo(null);
            this.dispose();
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

    private void jcloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcloseMouseExited
        Border borderLabel = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jclose.setBorder(borderLabel);
        jclose.setForeground(Color.black);
    }//GEN-LAST:event_jcloseMouseExited

    private void jcloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcloseMouseEntered
        Border borderLabel = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red);
        jclose.setBorder(borderLabel);
        jclose.setForeground(Color.red);
    }//GEN-LAST:event_jcloseMouseEntered

    private void jcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jcloseMouseClicked

    private void jminimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jminimizeMouseExited
        Border borderLabel = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jminimize.setBorder(borderLabel);
        jminimize.setForeground(Color.black);
    }//GEN-LAST:event_jminimizeMouseExited

    private void jminimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jminimizeMouseEntered
        Border borderLabel = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.green);
        jminimize.setBorder(borderLabel);
        jminimize.setForeground(Color.green);
    }//GEN-LAST:event_jminimizeMouseEntered

    private void jminimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jminimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jminimizeMouseClicked

    private void MPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MPSActionPerformed

    }//GEN-LAST:event_MPSActionPerformed

    private void CFMPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CFMPSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CFMPSActionPerformed

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
    private javax.swing.JLabel jclose;
    private javax.swing.JLabel jminimize;
    // End of variables declaration//GEN-END:variables
}
