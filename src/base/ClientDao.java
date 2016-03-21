package base;

import domaine.Client;
import domaine.Offre;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * Module 634.1 - TP Série P03
 * 
 * Gestion des accès à la base de données pour l'entité Client.
 *
 * @author VOTRE NOM
*/
public class ClientDao {
  
  /** Retourne la liste des clients d'une offre, dans l'ordre des nom et prénom. */
  public static ArrayList getListeClients (Offre offre) {
    ArrayList liste = new ArrayList();
    try {
      Connection con = ConnexionBase.get();
      PreparedStatement stmt = con.prepareStatement("SELECT * FROM Client c JOIN EstInscrit e ON c.idClient = e.idClient WHERE idOffre = ? ORDER BY nom, prenom");
      stmt.setInt(1, offre.getIdOffre());
      ResultSet rs = stmt.executeQuery();
      while (rs.next()) {
        Client client = new Client(rs.getInt("idClient"), rs.getString("Nom"), rs.getString("Prenom"), rs.getString("eMail"));
        liste.add(client);
      }
      stmt.close();
    } catch (Exception e) {
      System.out.println("ClientDao.getListeClients(): " + e.getMessage()); e.printStackTrace();
    }
    return liste;
  } // getListeClients
  
  /** Insère le client dans la base de donnée; retourne l'identifiant qui lui a été attribué. 
      Retourne -1 en cas d'erreur. */
  public static int insertClient (Client client) {
    /**** À COMPLÉTER ****/
    return -1;
  } // insertClient  

} // ClientDao
