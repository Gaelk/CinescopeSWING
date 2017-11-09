/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Departement;

import connexion.Connexion;
import java.sql.Connection;
import java.util.*;

/**
 *
 * @author Administrateur
 */
public class DepartementDAOTest {

    public static void main(String[] args) {
        Connection connexion = Connexion.seConnecter("localhost", "3306", "root", "", "cinescope2014");
        Departement update = new Departement(1, "94", "Val de Marne");
        Departement insert = new Departement("79", "Deux-Sèvres");

        DepartementDAO DAO = new DepartementDAO(connexion);
        DAO.insert(insert);
        //DAO.update(update);

        System.out.println("***** SELECT ONE *****");
        DAO = new DepartementDAO(connexion);
        System.out.println(DAO.selectOne(3));

        System.out.println("***** LISTE *****");
        List<Departement> liste = DAO.selectAll();
        for (int i = 0; i < liste.size(); i++) {
            System.out.println(liste.get(i));
        }
    }

}
