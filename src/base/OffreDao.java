package base;

import domaine.Client;
import domaine.Offre;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Module 634.1 - TP Série P03
 * 
 * Gestion des accès à la base de données pour l'entité Offre.
 *
 * @author VOTRE NOM
*/
public class OffreDao {
  
  /** Retourne la liste des offres, dans l'ordre des libellés. */
  public static ArrayList getListeOffres () {
    ArrayList liste = new ArrayList();
    try {
      Connection con = ConnexionBase.get();
      Statement stmt = con.createStatement();
      ResultSet rs = stmt.executeQuery("SELECT * FROM Offre ORDER BY Libelle");
      while(rs.next()){
        Offre offre = new Offre(rs.getInt("idOffre"), rs.getString("Libelle"), rs.getInt("Prix"), rs.getInt("MinInscrits"), rs.getInt("MaxInscrits"));
        liste.add(offre);
      }
      stmt.close();
    } catch (Exception e) {
      System.out.println("OffreDao.getListeOffres(): " + e.getMessage()); e.printStackTrace();
    }
    return liste;
  } // getListeOffres

  /** Ajoute le client à l'offre. */
  public static void addClientOffre (Client client, Offre offre) {
    /**** À COMPLÉTER ****/
  } // addClientOffre  
  
} // OffreDao
