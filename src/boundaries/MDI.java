/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundaries;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author formation
 */
public class MDI extends javax.swing.JFrame {

    /**
     * Creates new form MDI
     */
    public MDI() {
        initComponents();
        
        setTitle("MDI - Cinéscope 2017");
        setVisible(true);
        setLocationRelativeTo(null);
        //jMenuItemDCrudDepartementActionPerformed(null);
        jMenuItemSemaineApprecierActionPerformed(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuCrud = new javax.swing.JMenu();
        jMenuItemCrudAjout = new javax.swing.JMenuItem();
        jMenuItemCrudSuppression = new javax.swing.JMenuItem();
        jMenuItemCrudVisialisation = new javax.swing.JMenuItem();
        jMenuItemCrudModification = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItemCrudArrondissement = new javax.swing.JMenuItem();
        jMenuItemDCrudDepartement = new javax.swing.JMenuItem();
        jMenuItemVille = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItemCrudGenres = new javax.swing.JMenuItem();
        jMenuItemCrudrubriques = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItemCrudAppreciation = new javax.swing.JMenuItem();
        jMenuItemCrudJournalistes = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenuItemCrudCinema = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        jMenuItemCrudGenerique = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        jMenuChaqueSemaine = new javax.swing.JMenu();
        jMenuItemSemaineArticle = new javax.swing.JMenuItem();
        jMenuItemSemaineApprecier = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSemaineFilm = new javax.swing.JMenuItem();
        jMenuFenetre = new javax.swing.JMenu();
        jMenuItemMosaiqueCascade = new javax.swing.JMenuItem();
        jMenuItemmosaiqueHorizontale = new javax.swing.JMenuItem();
        jMenuItemMosaiqueVerticale = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemFermer = new javax.swing.JMenuItem();
        jMenuItemFermerTout = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItemContenu = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        aboutMenuItemApropos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        jMenuItem1.setText("Authentification");
        fileMenu.add(jMenuItem1);

        jMenuItem2.setText("Deconnexion");
        fileMenu.add(jMenuItem2);
        fileMenu.add(jSeparator2);

        jMenuItem3.setText("Quitter");
        fileMenu.add(jMenuItem3);

        menuBar.add(fileMenu);

        jMenuCrud.setText("CRUD");

        jMenuItemCrudAjout.setText("Pays (Ajout)");
        jMenuItemCrudAjout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCrudAjoutActionPerformed(evt);
            }
        });
        jMenuCrud.add(jMenuItemCrudAjout);

        jMenuItemCrudSuppression.setText("Pays (Suppression)");
        jMenuItemCrudSuppression.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCrudSuppressionActionPerformed(evt);
            }
        });
        jMenuCrud.add(jMenuItemCrudSuppression);

        jMenuItemCrudVisialisation.setText("Pays (Visualisation)");
        jMenuItemCrudVisialisation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCrudVisialisationActionPerformed(evt);
            }
        });
        jMenuCrud.add(jMenuItemCrudVisialisation);

        jMenuItemCrudModification.setText("Pays (Modification)");
        jMenuItemCrudModification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCrudModificationActionPerformed(evt);
            }
        });
        jMenuCrud.add(jMenuItemCrudModification);
        jMenuCrud.add(jSeparator3);

        jMenuItemCrudArrondissement.setText("Arrondissements CRUD");
        jMenuCrud.add(jMenuItemCrudArrondissement);

        jMenuItemDCrudDepartement.setText("Departement");
        jMenuItemDCrudDepartement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDCrudDepartementActionPerformed(evt);
            }
        });
        jMenuCrud.add(jMenuItemDCrudDepartement);

        jMenuItemVille.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemVille.setText("Villes CRUD");
        jMenuItemVille.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVilleActionPerformed(evt);
            }
        });
        jMenuCrud.add(jMenuItemVille);
        jMenuCrud.add(jSeparator4);

        jMenuItemCrudGenres.setText("Genres CRUD");
        jMenuCrud.add(jMenuItemCrudGenres);

        jMenuItemCrudrubriques.setText("Rubriques CRUD");
        jMenuCrud.add(jMenuItemCrudrubriques);
        jMenuCrud.add(jSeparator6);

        jMenuItem5.setText("Media (CRUD)");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenuCrud.add(jMenuItem5);

        jMenuItemCrudAppreciation.setText("Appréciation(CRUD)");
        jMenuCrud.add(jMenuItemCrudAppreciation);

        jMenuItemCrudJournalistes.setText("Journalistes (CRUD)");
        jMenuCrud.add(jMenuItemCrudJournalistes);
        jMenuCrud.add(jSeparator7);

        jMenuItemCrudCinema.setText("Cinéma(Ajout)");
        jMenuItemCrudCinema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCrudCinemaActionPerformed(evt);
            }
        });
        jMenuCrud.add(jMenuItemCrudCinema);
        jMenuCrud.add(jSeparator8);

        jMenuItemCrudGenerique.setText("Générique(GrUD)");
        jMenuCrud.add(jMenuItemCrudGenerique);

        menuBar.add(jMenuCrud);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        jMenuChaqueSemaine.setText("Chaque Semaine");

        jMenuItemSemaineArticle.setText("Articles(CRUD)");
        jMenuItemSemaineArticle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSemaineArticleActionPerformed(evt);
            }
        });
        jMenuChaqueSemaine.add(jMenuItemSemaineArticle);

        jMenuItemSemaineApprecier.setText("Apprécier(CRUD)");
        jMenuItemSemaineApprecier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSemaineApprecierActionPerformed(evt);
            }
        });
        jMenuChaqueSemaine.add(jMenuItemSemaineApprecier);
        jMenuChaqueSemaine.add(jSeparator5);

        jMenuItemSemaineFilm.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemSemaineFilm.setText("Film(Ajout)");
        jMenuChaqueSemaine.add(jMenuItemSemaineFilm);

        menuBar.add(jMenuChaqueSemaine);

        jMenuFenetre.setText("Fenetre");

        jMenuItemMosaiqueCascade.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemMosaiqueCascade.setText("Cascade");
        jMenuFenetre.add(jMenuItemMosaiqueCascade);

        jMenuItemmosaiqueHorizontale.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemmosaiqueHorizontale.setText("Horizontale");
        jMenuFenetre.add(jMenuItemmosaiqueHorizontale);

        jMenuItemMosaiqueVerticale.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemMosaiqueVerticale.setText("Verticale");
        jMenuItemMosaiqueVerticale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMosaiqueVerticaleActionPerformed(evt);
            }
        });
        jMenuFenetre.add(jMenuItemMosaiqueVerticale);
        jMenuFenetre.add(jSeparator1);

        jMenuItemFermer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemFermer.setText("Fermer");
        jMenuFenetre.add(jMenuItemFermer);

        jMenuItemFermerTout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemFermerTout.setText("Fermer tout");
        jMenuItemFermerTout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFermerToutActionPerformed(evt);
            }
        });
        jMenuFenetre.add(jMenuItemFermerTout);

        menuBar.add(jMenuFenetre);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Aide");

        contentMenuItemContenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        contentMenuItemContenu.setMnemonic('c');
        contentMenuItemContenu.setText("Contenu");
        contentMenuItemContenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentMenuItemContenuActionPerformed(evt);
            }
        });
        helpMenu.add(contentMenuItemContenu);

        jMenuItem4.setText("jMenuItem4");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        helpMenu.add(jMenuItem4);

        aboutMenuItemApropos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        aboutMenuItemApropos.setMnemonic('a');
        aboutMenuItemApropos.setText("A propos");
        helpMenu.add(aboutMenuItemApropos);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemMosaiqueVerticaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMosaiqueVerticaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemMosaiqueVerticaleActionPerformed

    private void jMenuItemFermerToutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFermerToutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemFermerToutActionPerformed

    private void jMenuItemSemaineArticleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSemaineArticleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemSemaineArticleActionPerformed

    private void jMenuItemSemaineApprecierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSemaineApprecierActionPerformed
        // TODO add your handling code here:
        JIFApprecier jif= new JIFApprecier();
        this.desktopPane.add(jif);
    }//GEN-LAST:event_jMenuItemSemaineApprecierActionPerformed

    private void jMenuItemCrudVisialisationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCrudVisialisationActionPerformed
        try {
            // TODO add your handling code here:
            JIFPaysVisu jif= new JIFPaysVisu();
            this.desktopPane.add(jif);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MDI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItemCrudVisialisationActionPerformed

    private void jMenuItemCrudSuppressionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCrudSuppressionActionPerformed
        // TODO add your handling code here:
        JIFPaysSuppression jif= new JIFPaysSuppression(); 
        this.desktopPane.add(jif);
    }//GEN-LAST:event_jMenuItemCrudSuppressionActionPerformed

    private void jMenuItemVilleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVilleActionPerformed
        try {
            // TODO add your handling code here:
            
            JIFVilleCrud jif= new JIFVilleCrud();
            this.desktopPane.add(jif);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MDI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItemVilleActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItemCrudCinemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCrudCinemaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemCrudCinemaActionPerformed

    private void jMenuItemCrudAjoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCrudAjoutActionPerformed
        // TODO add your handling code here:
        JIFPaysAjout jif= new JIFPaysAjout(); 
        this.desktopPane.add(jif);
    }//GEN-LAST:event_jMenuItemCrudAjoutActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        try {
            // TODO add your handling code here:
            JIFPaysCours jif= new JIFPaysCours();
            this.desktopPane.add(jif);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MDI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItemCrudModificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCrudModificationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemCrudModificationActionPerformed

    private void jMenuItemDCrudDepartementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDCrudDepartementActionPerformed
        try {
            // TODO add your handling code here:
            JIFDepartementCrud jif= new JIFDepartementCrud();
            this.desktopPane.add(jif);
        } catch (SQLException ex) {
            Logger.getLogger(MDI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MDI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jMenuItemDCrudDepartementActionPerformed

    private void contentMenuItemContenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentMenuItemContenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contentMenuItemContenuActionPerformed

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
            java.util.logging.Logger.getLogger(MDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MDI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItemApropos;
    private javax.swing.JMenuItem contentMenuItemContenu;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenu jMenuChaqueSemaine;
    private javax.swing.JMenu jMenuCrud;
    private javax.swing.JMenu jMenuFenetre;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItemCrudAjout;
    private javax.swing.JMenuItem jMenuItemCrudAppreciation;
    private javax.swing.JMenuItem jMenuItemCrudArrondissement;
    private javax.swing.JMenuItem jMenuItemCrudCinema;
    private javax.swing.JMenuItem jMenuItemCrudGenerique;
    private javax.swing.JMenuItem jMenuItemCrudGenres;
    private javax.swing.JMenuItem jMenuItemCrudJournalistes;
    private javax.swing.JMenuItem jMenuItemCrudModification;
    private javax.swing.JMenuItem jMenuItemCrudSuppression;
    private javax.swing.JMenuItem jMenuItemCrudVisialisation;
    private javax.swing.JMenuItem jMenuItemCrudrubriques;
    private javax.swing.JMenuItem jMenuItemDCrudDepartement;
    private javax.swing.JMenuItem jMenuItemFermer;
    private javax.swing.JMenuItem jMenuItemFermerTout;
    private javax.swing.JMenuItem jMenuItemMosaiqueCascade;
    private javax.swing.JMenuItem jMenuItemMosaiqueVerticale;
    private javax.swing.JMenuItem jMenuItemSemaineApprecier;
    private javax.swing.JMenuItem jMenuItemSemaineArticle;
    private javax.swing.JMenuItem jMenuItemSemaineFilm;
    private javax.swing.JMenuItem jMenuItemVille;
    private javax.swing.JMenuItem jMenuItemmosaiqueHorizontale;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem pasteMenuItem;
    // End of variables declaration//GEN-END:variables

}
