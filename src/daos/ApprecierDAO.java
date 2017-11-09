/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.sql.*;
import connexion.Connexion;
import entities.AppreciationDTO;
import entities.FilmDTO;
import entities.MediaDTO;
import daos.*;
import entities.ApprecierDTO;
import java.util.*;

/**
 *
 * @author formation
 */
public class ApprecierDAO {

    Connection connexionApprecier = Connexion.seConnecter("localhost", "3306", "root", "", "cinescope2014");
    private FilmDAO filmDao;
    private MediaDAO mediaDao;
    private AppreciationDAO appreciationDao;
    private String nomFilm, nomMedia, libelleAppreciation;
    private int idFilm, idMedia, idAppreciation;

    public ApprecierDAO() {
    }
//Constructeur avec parametres

    public ApprecierDAO(String nomFilm, String nomMedia, String libelleAppreciation) throws SQLException {

        //instanciation des DAOs pour l'acces à la BD
        filmDao = new FilmDAO(connexionApprecier);
        mediaDao = new MediaDAO(connexionApprecier);
        appreciationDao = new AppreciationDAO(connexionApprecier);

        //instanciaiton des DTOs pour recuperer les id grace aux noms 
        FilmDTO filmDto = new FilmDTO(nomFilm);
        MediaDTO mediaDto = new MediaDTO(nomMedia);
        AppreciationDTO appreciationDto = new AppreciationDTO(libelleAppreciation);

        //recuperation des id via les DAOs
        filmDao.getIdFilmDAO(filmDto);
        mediaDao.getIdMediaDAO(mediaDto);
        appreciationDao.getIdAppreciationDAO(appreciationDto);

        //definition des valeurs des attributs
        this.idFilm = filmDto.getIDFilm();
        this.idMedia = mediaDto.getIdMedia();
        this.idAppreciation = appreciationDto.getIdAppreciation();
        this.nomFilm = nomFilm;
        this.nomMedia = nomMedia;
        this.libelleAppreciation = libelleAppreciation;

    }

    public List<ApprecierDTO> selectAllFromApprecier() throws SQLException {
        //instanciation des objets pour l'acces aux tables  
        List<ApprecierDTO> liste = new ArrayList();
        filmDao = new FilmDAO(connexionApprecier);
        mediaDao = new MediaDAO(connexionApprecier);
        appreciationDao = new AppreciationDAO(connexionApprecier);

        FilmDTO filmDto;
        MediaDTO mediaDto;
        AppreciationDTO appreciationDto;
        ApprecierDTO apprecier;
        String requete_SQL = "SELECT * FROM apprecier ";

        /* recuperation des cles primaires de la table apprecier*/
        Statement execut_SQL = connexionApprecier.createStatement();
        //L'objet ResultSet contient les lignes de la table apprecier
        ResultSet resultat_BD = execut_SQL.executeQuery(requete_SQL);
        //lecture de resultat_BD
        while (resultat_BD.next()) {
            //instanciation des DTOs avec un id pour un futur acces à la BD
            //le but sera de recuperer les noms et libelle grace à l'id (pk)
            filmDto = new FilmDTO((int) resultat_BD.getInt("Id_film"));
            mediaDto = new MediaDTO((int) resultat_BD.getInt("Id_media"));
            appreciationDto = new AppreciationDTO((int) resultat_BD.getInt("Id_appreciation"));

            //attribution grace à leurs DAOs des noms(film, media, appreciation) des objetsDTO passés en param 
            filmDao.getNomFilmDAO(filmDto);
            mediaDao.getNomMediaDAO(mediaDto);
            appreciationDao.getLibelleAppreciationDAO(appreciationDto);

            //instanciation d'un objet apprecier avec les noms 
            apprecier = new ApprecierDTO(filmDto.getNomFilm(), mediaDto.getNomMedia(),
                    appreciationDto.getLibelleAppreciation());

            liste.add(apprecier);
        }

        return liste;
    }

    public void ajouterApprecier() {

        try {

            System.out.println("*****id Ajouter: " + this.getIdMedia() + " " + this.getIdFilm() + " " + this.getIdAppreciation());
            PreparedStatement requete_prepare = connexionApprecier.prepareStatement("insert into apprecier values(?, ?, ?)");
            requete_prepare.setInt(1, this.getIdMedia());
            requete_prepare.setInt(2, this.getIdFilm());
            requete_prepare.setInt(3, this.getIdAppreciation());
            requete_prepare.executeUpdate();

            requete_prepare.close();
            connexionApprecier.close();

        } catch (SQLException e) {
            System.err.println(e);
        }

    }

    public void supprimerApprecier() {

        String apprecierSql = "delete from apprecier where id_media = ? and id_film = ? and ID_appreciation= ?";

        try {

            System.out.println("***Id à Supprimer: " + this.getIdMedia() + " " + this.getIdFilm() + " " + this.getIdAppreciation());
            PreparedStatement requete_prepare = connexionApprecier.prepareStatement(apprecierSql);
            requete_prepare.setInt(1, this.getIdMedia());
            requete_prepare.setInt(2, this.getIdFilm());
            requete_prepare.setInt(3, this.getIdAppreciation());

            requete_prepare.executeUpdate();

            requete_prepare.close();
            connexionApprecier.close();

        } catch (SQLException e) {
            System.err.println(e);
        }

    }

    public void modifierApprecier(String nomFilm, String nomMedia, String libelleAppreciation) throws SQLException {

        ApprecierDAO holdValues = new ApprecierDAO(nomFilm, nomMedia, libelleAppreciation);
         
        System.out.println("***** Ancien id à modif : " + holdValues.getIdMedia() + " " + holdValues.getIdFilm() + " " + holdValues.getIdAppreciation());
       
        String apprecierSql = "update  apprecier SET id_appreciation=? "
                + " where  Id_film= ? and id_media=? ";

        try {

            PreparedStatement requete_prepare = connexionApprecier.prepareStatement(apprecierSql);
            requete_prepare.setInt(1, this.getIdAppreciation());
            requete_prepare.setInt(2, holdValues.getIdFilm());
            requete_prepare.setInt(3, holdValues.getIdMedia());

            requete_prepare.executeUpdate();

            requete_prepare.close();
            connexionApprecier.close();

        } catch (SQLException e) {
            System.err.println(e);
        }

    }

    public int getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(int idFilm) {
        this.idFilm = idFilm;
    }

    public int getIdMedia() {
        return idMedia;
    }

    public void setIdMedia(int idMedia) {
        this.idMedia = idMedia;
    }

    public int getIdAppreciation() {
        return idAppreciation;
    }

    public void setIdAppreciation(int idAppreciation) {
        this.idAppreciation = idAppreciation;
    }

    public String getNomFilm() {
        return nomFilm;
    }

    public void setNomFilm(String nomFilm) {
        this.nomFilm = nomFilm;
    }

    public String getNomMedia() {
        return nomMedia;
    }

    public void setNomMedia(String nomMedia) {
        this.nomMedia = nomMedia;
    }

    public String getLibelleAppreciation() {
        return libelleAppreciation;
    }

    public void setLibelleAppreciation(String libelleAppreciation) {
        this.libelleAppreciation = libelleAppreciation;
    }

}
