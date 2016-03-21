package base;

import base.mysql.Outils;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Modélise la connexion à la base
 *
 * @author Peter DAEHNE - HEG Genève
 * @version 1.1
 */
public class ConnexionBase {

  private static final String NOM_BASE = "AchatsGroupes"; /* Nom de la base de données */

  private static Connection con = null; /* La connexion avec la base */

  /* Établit la connexion et affecte con. */
  private static void connect () {
    try {con = Outils.connect(NOM_BASE);}
    catch (SQLException e) {System.out.println("ConnexionBase: " + e.getMessage()); e.printStackTrace();}
    catch (ClassNotFoundException e) {System.out.println("ConnexionBase: " + e.getMessage()); e.printStackTrace();}
  } // Constructeur

  /** Retourne la connexion */
  public static Connection get () {
    if (con == null) {connect();}
    return con;
  } // get

  /** Ferme la connexion */
  public static void close () {
    if (con == null) {return;}
    try {con.close(); con = null;}
    catch (SQLException e) {System.out.println("ConnexionBase: " + e.getMessage()); e.printStackTrace();}
  } // close

} // ConnexionBase
