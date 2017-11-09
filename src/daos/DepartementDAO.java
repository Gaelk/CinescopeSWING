/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.sql.*;
import connexion.Connexion;
import entities.Departement;
import java.util.*;

/**
 *
 * @author Administrateur
 */
public class DepartementDAO {

    private Connection connexionbd;

    public DepartementDAO(Connection icnx) {
        this.connexionbd = icnx;
    }

    public int insert(Departement departement) {
        int liAffecte = 0;

        try {

            //On crée l'objet avec la requête en paramètre
            PreparedStatement requete_prepare = connexionbd.prepareStatement("CALL departementInsert(?, ?)");

            requete_prepare.setString(1, departement.getCodeDepartement());
            requete_prepare.setString(2, departement.getNomDepartement());
            requete_prepare.executeUpdate();

            //requete_prepare.close();
            connexionbd.close();
            liAffecte = 1;

        } catch (SQLException e) {
            liAffecte = -1;
        }
        return liAffecte;
    }

    public int update(Departement departement) {
        int liAffecte = 0;

        try {

            PreparedStatement requete_prepare = connexionbd.prepareStatement("CALL departementUpdate(?, ?, ?)");
            
            requete_prepare.setInt(1, departement.getIdDepartement());
            requete_prepare.setString(2, departement.getCodeDepartement());
            requete_prepare.setString(3, departement.getNomDepartement());

            requete_prepare.executeUpdate();

            //requete_prepare.close();
            connexionbd.close();
            liAffecte = 1;

        } catch (SQLException e) {
            liAffecte = -1;
        }
        return liAffecte;
    }

    public int delete(Departement d) {
        int liAffecte;

        try {
            String lsSQL = "DELETE FROM departement WHERE id_departement = ?";
            PreparedStatement lpst = connexionbd.prepareStatement(lsSQL);
            lpst.setInt(1, d.getIdDepartement());
            liAffecte = lpst.executeUpdate();
            connexionbd.commit();
            lpst.close();
        } catch (SQLException e) {
            liAffecte = -1;
            System.out.println(e.getMessage());
        }

        return liAffecte;
    } /// delete

    /**
     *
     * @return
     */
    public List<Departement> selectAll() {
        ResultSet lrs = null;
        List<Departement> liste = new ArrayList();
        Departement d;

        try {
            // String lsSQL = "SELECT * FROM departement"; //remplacer par une Procedure stockée 
            Statement lpst = connexionbd.createStatement();
            lrs = lpst.executeQuery("SELECT * FROM DEPARTEMENT"/*"CALL departementSelectAll()"*/);
            while (lrs.next()) {
                d = new Departement(lrs.getInt(1), lrs.getString("code_departement"), lrs.getString("nom_departement"));
                liste.add(d);
            }

            //lrs.beforeFirst();
            lrs.close();
            lpst.close();
        } catch (SQLException e) {
            d = new Departement(-1, e.getMessage(), e.getMessage());
            liste.add(d);
        }
        return liste;
    } /// selectAll

    /**
     *
     * @param id
     * @return
     */
    public Departement selectOne(int id) {
        Departement d = new Departement();

        try {
            String lsSQL = "SELECT * FROM departement WHERE id_departement = ?";
            PreparedStatement lpst = connexionbd.prepareStatement(lsSQL);
            lpst.setInt(1, id);
            ResultSet lrs = lpst.executeQuery();
            if (lrs.next()) {
                d.setIdDepartement(id);
                d.setCodeDepartement(lrs.getString("code_departement"));
                d.setNomDepartement(lrs.getString("nom_departement"));
            } else {
                d.setIdDepartement(0);
                d.setCodeDepartement("INTROUVABLE");
                d.setNomDepartement("INTROUVABLE");
            }
            lrs.close();
            lpst.close();
        } catch (SQLException e) {
            d.setIdDepartement(-1);
            d.setCodeDepartement(e.getMessage());
            d.setNomDepartement(e.getMessage());
        }

        return d;
    } /// selectOne

}
