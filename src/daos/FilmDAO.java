/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.sql.*;
import connexion.Connexion;
import entities.FilmDTO;
import java.util.*;

/**
 *
 * @author formation
 */
public class FilmDAO {

    private Connection connexion;
    // private FilmDTO film;

    public FilmDAO(Connection con) {
        this.connexion = con;
    }

    public void getIdFilmDAO(FilmDTO film) throws SQLException {
     
        String reqSQL = "SELECT ID_film from film where Titre_film = " + "\"" + film.getNomFilm()+"\"";
        Statement exeSQL = connexion.createStatement();
        ResultSet resulSQL = exeSQL.executeQuery(reqSQL);

        while (resulSQL.next()) {
            film.setIDFilm(resulSQL.getInt("ID_film"));
            
           System.out.println("id filmDAO= " + film.getIDFilm());
        }
        resulSQL.close();
        exeSQL.close();
    }
    
        public void getNomFilmDAO(FilmDTO film) throws SQLException {
     
        String reqSQL = "SELECT TITRE_FILM from film where id_film = " + film.getIDFilm();
        Statement exeSQL = connexion.createStatement();
        ResultSet resulSQL = exeSQL.executeQuery(reqSQL);

        while (resulSQL.next()) {
            film.setNomFilm(resulSQL.getString("titre_film"));
            
            System.out.println("tire filmDAO= "+ film.getNomFilm());
        }
        resulSQL.close();
        exeSQL.close();
    }

    
    public List<FilmDTO> selectFilmsDAO() {

        ResultSet rows = null;
        List<FilmDTO> listeFilm = new ArrayList();
        FilmDTO film;

        try {

            Statement executeSQL = connexion.createStatement();

            rows = executeSQL.executeQuery("SELECT * FROM FILM"/*"CALL filmSelectAll()"*/);
            while (rows.next()) {
                film = new FilmDTO(rows.getInt(1), rows.getString("TITRE_FILM"));
                listeFilm.add(film);
            }

            rows.close();
            executeSQL.close();
            

        } catch (SQLException e) {
            film = new FilmDTO(-1, e.getMessage());
            listeFilm.add(film);
        }

        return listeFilm;
    }

}
