package student;

import db.userConnection;
import java.awt.Color;
import static java.lang.Float.parseFloat;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.TableView;

public class Matieres extends javax.swing.JFrame {
    String matiere, prof;
    float coef;
    DefaultTableModel tableMat;
    Object[] rowDataMatiere;

    public Matieres() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nomMatiere = new javax.swing.JTextField();
        coefMatiere = new javax.swing.JTextField();
        nomProfMatiere = new javax.swing.JTextField();
        ajouterMatiere = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMatieres = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ajouter des matieres");
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(600, 300));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setBackground(new java.awt.Color(0, 102, 153));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Nom matiere:");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setBackground(new java.awt.Color(0, 102, 153));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Nom du Professeur:");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setBackground(new java.awt.Color(0, 102, 153));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Coefficient:");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        nomMatiere.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        nomMatiere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomMatiereActionPerformed(evt);
            }
        });

        coefMatiere.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        nomProfMatiere.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        ajouterMatiere.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ajouterMatiere.setText("Ajouter");
        ajouterMatiere.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ajouterMatiereMouseClicked(evt);
            }
        });
        ajouterMatiere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterMatiereActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomProfMatiere, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(coefMatiere, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                            .addComponent(nomMatiere, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(37, 37, 37)
                        .addComponent(ajouterMatiere, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nomMatiere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(coefMatiere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ajouterMatiere))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomProfMatiere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        tableMatieres.setBackground(new java.awt.Color(204, 204, 204));
        tableMatieres.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        tableMatieres.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matiere", "Coefficient", "Professeur"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableMatieres.setGridColor(new java.awt.Color(0, 0, 0));
        tableMatieres.setSelectionBackground(new java.awt.Color(0, 51, 102));
        tableMatieres.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tableMatieres.setShowGrid(true);
        jScrollPane1.setViewportView(tableMatieres);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomMatiereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomMatiereActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomMatiereActionPerformed

    private void ajouterMatiereMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouterMatiereMouseClicked
        try{
            matiere = nomMatiere.getText().toUpperCase();
            prof = nomProfMatiere.getText().toUpperCase();
            coef = parseFloat(coefMatiere.getText());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Cause: " + e.getCause());
            System.out.println("-----------------------------------");
        }
        tableMat = (DefaultTableModel) tableMatieres.getModel();
        rowDataMatiere = new Object[]{matiere, coef, prof};
        boolean matiereFound = false;
        for(int i=0; i<tableMat.getRowCount(); i++){
            if(matiere.equals(tableMat.getValueAt(i, 0).toString().toUpperCase())){
                matiereFound = true;
            }
        }
        if (!matiereFound && !matiere.equals("") && coef != 0 && !prof.equals(""))
            tableMat.addRow(rowDataMatiere);
        else if (coef == 0 || matiere.equals("") || prof.equals(""))
            JOptionPane.showMessageDialog(this, "Champ(s) vides ou invalides!", "Avertissement", JOptionPane.WARNING_MESSAGE);
        else if (matiereFound)
            JOptionPane.showMessageDialog(this, "Matiere deja ajoutee!", "Avertissement", JOptionPane.WARNING_MESSAGE);

        String mat, prf;
        float cf;
        String query;
        try{
            for(Vector row: tableMat.getDataVector()){
                userConnection.connect();
                mat = row.get(0).toString();
                cf = parseFloat(row.get(1).toString());
                prf = row.get(2).toString();
                query = "INSERT INTO matieres (nom_matiere, coefficient, professeur) VALUES ('" + mat + "', '" + cf + "', '" + prf + "')";
                userConnection.insertIntoDB(query);
                userConnection.closeConnection();
            }
        }   catch(Exception ex){
                System.out.println("Error: " + ex.getMessage());
                System.out.println("Cause: " + ex.getCause());
                }
        
    }//GEN-LAST:event_ajouterMatiereMouseClicked

    private void ajouterMatiereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterMatiereActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ajouterMatiereActionPerformed

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
            java.util.logging.Logger.getLogger(Matieres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Matieres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Matieres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Matieres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Matieres().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajouterMatiere;
    private javax.swing.JTextField coefMatiere;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomMatiere;
    private javax.swing.JTextField nomProfMatiere;
    javax.swing.JTable tableMatieres;
    // End of variables declaration//GEN-END:variables
}
