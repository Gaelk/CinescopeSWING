/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.sql.*;
import connexion.Connexion;
import entities.AppreciationDTO;
import java.util.*;

/**
 *
 * @author formation
 */
public class AppreciationDAO {

    Connection connexion;

    public AppreciationDAO(Connection connexion) {
        this.connexion = connexion;
    }
    
            

    public void getIdAppreciationDAO(AppreciationDTO appreciation) throws SQLException {

        String reqSQL = "SELECT ID_appreciation from appreciation where Libelle_appreciation= " + "\"" + appreciation.getLibelleAppreciation() + "\"";
        Statement exeSQL = connexion.createStatement();
        ResultSet resulSQL = exeSQL.executeQuery(reqSQL);

        while (resulSQL.next()) {
            appreciation.setIdAppreciation(resulSQL.getInt("ID_appreciation"));
            System.out.println("Id_libelleAppreciationDAO = " + appreciation.getIdAppreciation());
        }
        resulSQL.close();
        exeSQL.close();
    }

    public void getLibelleAppreciationDAO(AppreciationDTO appreciation) throws SQLException {

        String reqSQL = "SELECT Libelle_appreciation from appreciation where ID_appreciation= " + appreciation.getIdAppreciation();
        Statement exeSQL = connexion.createStatement();
        ResultSet resulSQL = exeSQL.executeQuery(reqSQL);

        while (resulSQL.next()) {
            appreciation.setLibelleAppreciation(resulSQL.getString("Libelle_appreciation"));
            System.out.println("libe appreciationDAO= " + appreciation.getLibelleAppreciation());
        }
        resulSQL.close();
        exeSQL.close();
    }

    public List<AppreciationDTO> selectAppreciationDAO() {

        ResultSet rows = null;
        List<AppreciationDTO> listeAppreciation = new ArrayList();
        AppreciationDTO appreciation;

        try {

            Statement executeSQL = connexion.createStatement();

            rows = executeSQL.executeQuery("SELECT * FROM APPRECIATION"/*"CALL filmSelectAll()"*/);
            while (rows.next()) {
                appreciation = new AppreciationDTO(rows.getInt(1), rows.getString("LIBELLE_appreciation"));
                listeAppreciation.add(appreciation);
            }

            rows.close();
            executeSQL.close();

        } catch (SQLException e) {
            appreciation = new AppreciationDTO(-1, e.getMessage());
            listeAppreciation.add(appreciation);
        }

        return listeAppreciation;
    }
}
