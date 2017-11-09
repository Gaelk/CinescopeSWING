/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.sql.*;
import connexion.Connexion;
import entities.MediaDTO;
import java.util.*;

/**
 *
 * @author formation
 */
public class MediaDAO {

    Connection connexionBD;

    public MediaDAO(Connection connexion) {
        this.connexionBD = connexion;
    }

    public void getIdMediaDAO(MediaDTO media) throws SQLException {
       // System.out.println("nommedia: " + media.getNomMedia());
        String reqSQL = "SELECT ID_media from media where nom_media = " + "\"" + media.getNomMedia() + "\"";
        Statement exeSQL = connexionBD.createStatement();
        ResultSet resulSQL = exeSQL.executeQuery(reqSQL);

        while (resulSQL.next()) {
            media.setIdMedia(resulSQL.getInt("ID_media"));
            System.out.println("idMediaDAO= " + media.getIdMedia());
        }

        resulSQL.close();
        exeSQL.close();
    }

    public void getNomMediaDAO(MediaDTO media) throws SQLException {
        //System.out.println("nommedia: " + media.getNomMedia());
        String reqSQL = "SELECT nom_media from media where ID_media = "+ media.getIdMedia();
        Statement exeSQL = connexionBD.createStatement();
        ResultSet resulSQL = exeSQL.executeQuery(reqSQL);

        while (resulSQL.next()) {
            media.setNomMedia(resulSQL.getString("nom_media"));
            System.out.println("nom MediaDAO= " + media.getNomMedia());
        }

        resulSQL.close();
        exeSQL.close();
    }

    public List<MediaDTO> selectMediaDAO() {

        ResultSet rows = null;
        List<MediaDTO> listeMedia = new ArrayList();
        MediaDTO media;

        try {

            Statement executeSQL = connexionBD.createStatement();

            rows = executeSQL.executeQuery("SELECT * FROM MEDIA"/*"CALL filmSelectAll()"*/);
            while (rows.next()) {
                media = new MediaDTO(rows.getInt(1), rows.getString("NOM_media"));
                listeMedia.add(media);
            }

            rows.close();
            executeSQL.close();

        } catch (SQLException e) {
            media = new MediaDTO(-1, e.getMessage());
            listeMedia.add(media);
        }

        return listeMedia;
    }

}
