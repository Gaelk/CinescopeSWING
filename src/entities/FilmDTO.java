/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;
import java.sql.*;
import connexion.Connexion;

/**
 *
 * @author formation
 */

//


public class FilmDTO {
    
    Connection connexionBD= Connexion.seConnecter("localhost", "3306", "root", "", "cinescope2014");
    
    private int IDFilm;
    private String nomFilm;

    public FilmDTO() {
    }

    public FilmDTO(int IDFilm) {
        this.IDFilm = IDFilm;
    }
    

    public FilmDTO(String nomFilm) {
        this.nomFilm = nomFilm;
    }

    
    public FilmDTO(int IDFilm, String nomFilm) {
        this.IDFilm = IDFilm;
        this.nomFilm = nomFilm;
    }

    public int getIDFilm() {
        return IDFilm;
    }

    public void setIDFilm(int IDFilm) {
        
        this.IDFilm = IDFilm;
    }

    public String getNomFilm() {
        return nomFilm;
    }

    public void setNomFilm(String nomFilm) {
        this.nomFilm = nomFilm;
    }
    

    @Override
    public String toString() {
        return "FilmDTO{" + "IDFilm=" + IDFilm + ", nomFilm=" + nomFilm + '}';
    }

  
    
}
