/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundaries;

import java.sql.*;

/**
 *
 * @author formation
 */
public class JIFVilleCrud extends javax.swing.JInternalFrame {

    /**
     * Creates new form JIFVilleCrud
     */
    public JIFVilleCrud() throws ClassNotFoundException {
        initComponents();
        this.setLocation(500, 500);
        setVisible(true);
        setTitle("VILLE CRUD");

        ConnexionBD ville = new ConnexionBD("SELECT * FROM villes");

        /**
         * *************************************************
         */
        int iteration = 0;
        try {
            Class.forName(ville.pilote);
            ville.Connexion_BD();

            while (ville.resultat_BD.next()) {
                ville.mesDonnees[iteration++] = ville.resultat_BD.getString(2);
            }
            ville.Deconnexion();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        /**
         * *************************************************
         */
   //affichage textArea
        jListVille.setListData(ville.mesDonnees);
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonListe = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListVille = new javax.swing.JList<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Villes crud");
        setAlignmentX(100.0F);
        setAlignmentY(100.0F);
        setAutoscrolls(true);

        jButtonListe.setText("Lister");
        jButtonListe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListeActionPerformed(evt);
            }
        });

        jListVille.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jListVille);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButtonListe, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(307, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jButtonListe)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonListeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListeActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButtonListeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonListe;
    private javax.swing.JList<String> jListVille;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}