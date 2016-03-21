package metier;

import base.OffreDao;
import domaine.Offre;

/**
 * Module 634.1 - TP Série P03
 * 
 * Liste des offres (dans l'ordre des libellés) avec une position courante
 *
 * @author Peter DAEHNE - HEG Genève
 * @version 1.0
 */
public class ListeOffres extends ListeObjects {

  /** Constructeur */
  public ListeOffres () {liste = OffreDao.getListeOffres();}

  /** Retourne l'offre courante, null si la position courante est NO_POS */
  public Offre getCourant () {return (Offre)super.getCourant();}

  /** Retourne l'offre d'indice k, null si k n'est pas correctement défini */
  public Offre get (int k) {return (Offre)super.get(k);}
  
  public int offreValide(int nbInscrits){
    Offre offre = this.getCourant();
    if (nbInscrits < offre.getMinInscrits()) {
     return -1;
    }
    else if(nbInscrits >= offre.getMaxInscrits()){
      return 1;
    }
    else{
      return 0;
    }
  }
} // ListeOffres
