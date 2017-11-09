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
public class AppreciationDTO {

    private int idAppreciation;
    private String libelleAppreciation;

    public AppreciationDTO() {
    }

    public AppreciationDTO(int idAppreciation) {
        this.idAppreciation = idAppreciation;
    }

    public AppreciationDTO(String libelleAppreciation) {
        this.libelleAppreciation = libelleAppreciation;
    }
    

    public AppreciationDTO(int idAppreciation, String libelleAppreciation) {
        this.idAppreciation = idAppreciation;
        this.libelleAppreciation = libelleAppreciation;
    }

    public int getIdAppreciation() {
        return idAppreciation;
    }

    public void setIdAppreciation(int idAppreciation) {
        this.idAppreciation = idAppreciation;
    }

    public String getLibelleAppreciation() {
        return libelleAppreciation;
    }

    public void setLibelleAppreciation(String libelleAppreciation) {
        this.libelleAppreciation = libelleAppreciation;
    }

    @Override
    public String toString() {
        return "AppreciationDTO{" + "idAppreciation=" + idAppreciation + ", libelleAppreciation=" + libelleAppreciation + '}';
    }

}
