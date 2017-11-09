/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Administrateur
 */
public class Departement {
    
    private int idDepartement;
    private String codeDepartement;
    private String nomDepartement;
    
    public Departement(){
    }

    public Departement(int idDepartement, String codeDepartement, String nomDepartment) {
        this.idDepartement = idDepartement;
        this.codeDepartement = codeDepartement;
        this.nomDepartement = nomDepartment;
    }

    public Departement(String codeDepartement, String nomDepartment) {
        this.codeDepartement = codeDepartement;
        this.nomDepartement = nomDepartment;
    }

    public int getIdDepartement() {
        return idDepartement;
    }

    public void setIdDepartement(int idDepartement) {
        this.idDepartement = idDepartement;
    }

    public String getCodeDepartement() {
        return codeDepartement;
    }

    public void setCodeDepartement(String codeDepartement) {
        this.codeDepartement = codeDepartement;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartment) {
        this.nomDepartement = nomDepartment;
    }

    @Override
    public String toString() {
        return "Departement{" + "idDepartement=" + idDepartement + ", codeDepartement=" + codeDepartement + ", nomDepartment=" + nomDepartement + '}';
    }
    
    
    
}
