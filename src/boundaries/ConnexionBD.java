/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundaries;

import java.sql.*;

/**
 *
 * @author formation
 */
public class ConnexionBD {

    Connection connexion_bd;
    Statement execut_SQL;
    ResultSet resultat_BD;
    String requete_SQL;

    // --- Pour une connexion execut_SQL native
    String localhost = "127.0.0.1";
    String Port = "3306";
    String nom_BD = "cours";
    String user = "root";
    String mdp = "";
   public String pilote = "org.gjt.mm.mysql.Driver";
    String url = "jdbc:mysql://" + localhost + ":" + Port + "/" + nom_BD;
    //StringBuilder lsbContenu = new StringBuilder("");

    String[] mesDonnees = new String[25];
    int iteration;

    public ConnexionBD(String requete) {
        //ex: requete="SELECT * FROM villes"
        requete_SQL = requete;
        iteration = 0;
        
/*
        try {
            Class.forName(pilote);
            Connexion_BD();

            while (resultat_BD.next()) {
                // lsbContenu.append(resultat_BD.getString(2));
                mesDonnees[iteration++] = resultat_BD.getString(2);
            }
            
            //Deconnexion();

        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.getMessage());
        }
*/
    }

    
    
    public void Connexion_BD() throws SQLException {
        //tentative de connexion a la BD
        connexion_bd = DriverManager.getConnection(url, user, mdp);
        //Création d'un objet Statement pour execution requete SQL
        execut_SQL = connexion_bd.createStatement();
        //L'objet ResultSet contient le résultat de la requête SQL
        resultat_BD = execut_SQL.executeQuery(requete_SQL);

    }

    protected void Deconnexion() throws SQLException {
        resultat_BD.close();
        execut_SQL.close();
        connexion_bd.close();

    }

}
