/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

/**
 *
 * @author formation
 */
public class MediaDTO {
    
    private int idMedia;
    private String nomMedia;

    public MediaDTO() {
    }

    public MediaDTO(int idMedia) {
        this.idMedia = idMedia;
    }

    public MediaDTO(String nomMedia) {
        this.nomMedia = nomMedia;
    }

   
    public MediaDTO(int idMedia, String nomMedia) {
        this.idMedia = idMedia;
        this.nomMedia = nomMedia;
    }

    public int getIdMedia() {
        return idMedia;
    }

    public void setIdMedia(int idMedia) {
        this.idMedia = idMedia;
    }

    public String getNomMedia() {
        return nomMedia;
    }

    public void setNomMedia(String nomMedia) {
        this.nomMedia = nomMedia;
    }

    @Override
    public String toString() {
        return "MediaDTO{" + "idMedia=" + idMedia + ", nomMedia=" + nomMedia + '}';
    }
    
    
    
    
    
}
