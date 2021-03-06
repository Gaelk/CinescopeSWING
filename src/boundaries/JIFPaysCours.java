/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundaries;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
//import connexion.Connexion;

/**
 *
 * @author formation
 */
public class JIFPaysCours extends javax.swing.JInternalFrame {

    /**
     * Creates new form JIFPaysCours
     */
    Connection connexion_bd;
    Statement execut_SQL;
    ResultSet resultat_BD;

    // --- Pour une connexion execut_SQL native
    String localhost = "127.0.0.1";
    String Port = "3306";
    String nom_BD = "cinescope2014";
    String user = "root";
    String mdp = "";
    String pilote = "org.gjt.mm.mysql.Driver";
    String url = "jdbc:mysql://" + localhost + ":" + Port + "/" + nom_BD;
    String requete_SQL = "SELECT * FROM pays ";

    public JIFPaysCours() throws ClassNotFoundException {
        initComponents();
        setVisible(true);

        try {
            Class.forName(pilote);
            //tentative de connexion a la BD
            connexion_bd = DriverManager.getConnection(url, user, mdp);
            //Création d'un objet Statement pour execution requete SQL
            execut_SQL = connexion_bd.createStatement();
            //L'objet ResultSet contient le résultat de la requête SQL
            resultat_BD = execut_SQL.executeQuery(requete_SQL);
            //On récupère les MetaData
            ResultSetMetaData resultMeta = resultat_BD.getMetaData();

            resultat_BD.last();
            int nbreLigne = resultat_BD.getRow();
            System.out.println(nbreLigne);
            System.out.println(resultMeta.getColumnCount());
            Object[][] tLignes = new Object[nbreLigne][resultMeta.getColumnCount()];
            Object[] tEntetes = new Object[resultMeta.getColumnCount()];
            resultat_BD.beforeFirst();

            //JTable dynamique 
            for (int j = 0; j < nbreLigne; j++) {
                resultat_BD.next();
                for (int i = 0; i < resultMeta.getColumnCount(); i++) {
                    int increment = i + 1;
                    tLignes[j][i] = resultat_BD.getObject(increment);
                    tEntetes[i] = resultMeta.getColumnName(increment).toString();
                }
            }

//            int j = 0;
//            while (resultat_BD.next()) {
//                for (int i = 0; i < resultMeta.getColumnCount(); i++) {
//                    int zoro = i + 1;
//                    tLignes[j][i] = resultat_BD.getObject(zoro);
//
//                }
//                j++;
//            }
//            for (int i = 0; i < resultMeta.getColumnCount(); i++) {
//                int increment = i + 1;
//                tEntetes[i] = resultMeta.getColumnName(increment).toString();
//            }
            DefaultTableModel dtm = new DefaultTableModel(tLignes, tEntetes);
            jTablePAys.setModel(dtm);

            resultat_BD.close();
            execut_SQL.close();
            connexion_bd.close();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePAys = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setAutoscrolls(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTablePAys.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTablePAys);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePAys;
    // End of variables declaration//GEN-END:variables

}
