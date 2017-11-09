/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Gael
 */
public class ApprecierDTO {
    
    private String nomFilmApprecier;
    private String nomMediaApprecier;
    private String libelleAppreciationApprecier;

    public ApprecierDTO(String nomFilmApprecier, String nomMediaApprecier, String libelleAppreciationApprecier) {
        this.nomFilmApprecier = nomFilmApprecier;
        this.nomMediaApprecier = nomMediaApprecier;
        this.libelleAppreciationApprecier = libelleAppreciationApprecier;
    }

    public String getNomFilmApprecier() {
        return nomFilmApprecier;
    }

    public void setNomFilmApprecier(String nomFilmApprecier) {
        this.nomFilmApprecier = nomFilmApprecier;
    }

    public String getNomMediaApprecier() {
        return nomMediaApprecier;
    }

    public void setNomMediaApprecier(String nomMediaApprecier) {
        this.nomMediaApprecier = nomMediaApprecier;
    }

    public String getLibelleAppreciationApprecier() {
        return libelleAppreciationApprecier;
    }

    public void setLibelleAppreciationApprecier(String libelleAppreciationApprecier) {
        this.libelleAppreciationApprecier = libelleAppreciationApprecier;
    }

    @Override
    public String toString() {
        return "ApprecierDTO{" + "nomFilmApprecier=" + nomFilmApprecier + ", nomMediaApprecier=" + nomMediaApprecier + ", libelleAppreciationApprecier=" + libelleAppreciationApprecier + '}';
    }
    
    
    
}
