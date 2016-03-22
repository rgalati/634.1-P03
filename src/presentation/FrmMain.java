package presentation;

import domaine.Client;
import domaine.Offre;
import metier.ListeClients;
import metier.ListeOffres;

/**
 * Module 634.1 - TP Série P03
 * 
 * Fenêtre de l'application
 *
 * @author VOTRE NOM
 */
public class FrmMain extends java.awt.Frame {
  
  /* Strings constants employés dans l'application */
  private static final String MSG_VALIDEE = "Cette offre est validée";
  private static final String MSG_NON_VALIDEE = "Cette offre n'est pas validée";
  private static final String MSG_MAX_ATTEINT = "Le nombre maximal d'inscrits est atteint";
  private static final String TITRE_LSTCLIENTS = "Clients inscrits à l'offre";
  private static final int NON_VALIDEE = -1;
  private static final int VALIDEE = 0;
  private static final int MAX_ATTEINT = 1;
  
  
  private ListeClients listeClients;
  private ListeOffres listeOffres;
  
  /** Constructeur */
  public FrmMain () {
    initComponents();
    initListe();
  } // Constructeur
  
  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        java.awt.Label label1 = new java.awt.Label();
        lstOffres = new java.awt.List();
        lblLstClients = new java.awt.Label();
        lstClients = new java.awt.List();
        java.awt.Label label7 = new java.awt.Label();
        tfPrix = new java.awt.TextField();
        java.awt.Label label8 = new java.awt.Label();
        tfMinInscrits = new java.awt.TextField();
        java.awt.Label label9 = new java.awt.Label();
        tfMaxInscrits = new java.awt.TextField();
        tfMessage = new java.awt.TextField();
        java.awt.Label label3 = new java.awt.Label();
        java.awt.Label label4 = new java.awt.Label();
        tfNom = new java.awt.TextField();
        java.awt.Label label5 = new java.awt.Label();
        tfPrenom = new java.awt.TextField();
        java.awt.Label label6 = new java.awt.Label();
        tfEMail = new java.awt.TextField();
        btnEnregistrer = new java.awt.Button();

        setResizable(false);
        setTitle("Achats groupés");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        label1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label1.setText("Offres proposées");

        lstOffres.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                lstOffresItemStateChanged(evt);
            }
        });

        lblLstClients.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblLstClients.setText("Clients inscrits à l'offre");

        label7.setText("Prix de l'offre");

        tfPrix.setEditable(false);
        tfPrix.setEnabled(false);

        label8.setText("Nombre minimum d'inscrits");

        tfMinInscrits.setEditable(false);
        tfMinInscrits.setEnabled(false);

        label9.setText("Nombre maximum d'inscrits");

        tfMaxInscrits.setEditable(false);
        tfMaxInscrits.setEnabled(false);

        tfMessage.setEditable(false);
        tfMessage.setEnabled(false);
        tfMessage.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        label3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label3.setText("Inscription d'un nouveau client à l'offre");

        label4.setText("Nom");

        tfNom.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                tfNomTextValueChanged(evt);
            }
        });

        label5.setText("Prénom");

        tfPrenom.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                tfPrenomTextValueChanged(evt);
            }
        });

        label6.setText("e-mail");

        tfEMail.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                tfEMailTextValueChanged(evt);
            }
        });

        btnEnregistrer.setEnabled(false);
        btnEnregistrer.setLabel("Enregistrer l'inscription");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lstOffres, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfMinInscrits, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(tfMaxInscrits, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(tfPrix, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLstClients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lstClients, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfEMail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfPrenom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfNom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(btnEnregistrer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblLstClients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lstClients, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lstOffres, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfPrix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfMinInscrits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfMaxInscrits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfEMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEnregistrer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
  private void initListe(){
    listeOffres = new ListeOffres();
    for (int i = 0; i < listeOffres.size(); i++) {
      lstOffres.add(listeOffres.get(i).getLibelle());
    }    
  }
  
  private void displayOffre(){
    int pos = listeOffres.getPos();
    Offre offre = listeOffres.get(pos);
    int min = offre.getMinInscrits();
    int max = offre.getMaxInscrits();
    tfPrix.setText(""+offre.getPrix());
    tfMinInscrits.setText(""+min);
    tfMaxInscrits.setText(""+max);
    int nbInscrits = listeClients.size();

    switch(listeOffres.offreValide(nbInscrits)){
      case NON_VALIDEE: tfMessage.setText(MSG_NON_VALIDEE); break;
      case VALIDEE: tfMessage.setText(MSG_VALIDEE); break;
      default: tfMessage.setText(MSG_MAX_ATTEINT); break;
    }
  }
  
  private void initClient(){
    int id = lstOffres.getSelectedIndex();
    listeOffres.setPos(id);
    listeClients = new ListeClients(listeOffres.getCourant());
    lstClients.removeAll();
    for (int i = 0; i < listeClients.size(); i++) {
      lstClients.add(listeClients.get(i).toString());
    }
  }
  
  private void enregistrementValide(){
      if(listeOffres.getCourant() != null){
        if (!tfNom.getText().isEmpty() && !tfPrenom.getText().isEmpty() && !tfEMail.getText().isEmpty() ) {
            if (listeOffres.offreValide(listeClients.size()) != MAX_ATTEINT) {
                System.out.println(listeOffres.offreValide(listeClients.size()));
                btnEnregistrer.setEnabled(true);
            }
            else{
                btnEnregistrer.setEnabled(false);
            }
        }
        else{
            btnEnregistrer.setEnabled(false);
        }
      }
  }

  /** Fin de l'application */
  private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
      base.ConnexionBase.close();System.out.println("Tcho"); System.out.println("Tonio est un p**");
      System.exit(0);
  }//GEN-LAST:event_exitForm

  private void lstOffresItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_lstOffresItemStateChanged
    initClient();
    displayOffre();
    enregistrementValide();
  }//GEN-LAST:event_lstOffresItemStateChanged

    private void tfNomTextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_tfNomTextValueChanged
        enregistrementValide();
    }//GEN-LAST:event_tfNomTextValueChanged

    private void tfPrenomTextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_tfPrenomTextValueChanged
        enregistrementValide();
    }//GEN-LAST:event_tfPrenomTextValueChanged

    private void tfEMailTextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_tfEMailTextValueChanged
        enregistrementValide();
    }//GEN-LAST:event_tfEMailTextValueChanged
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnEnregistrer;
    private java.awt.Label lblLstClients;
    private java.awt.List lstClients;
    private java.awt.List lstOffres;
    private java.awt.TextField tfEMail;
    private java.awt.TextField tfMaxInscrits;
    private java.awt.TextField tfMessage;
    private java.awt.TextField tfMinInscrits;
    private java.awt.TextField tfNom;
    private java.awt.TextField tfPrenom;
    private java.awt.TextField tfPrix;
    // End of variables declaration//GEN-END:variables

} // FrmMain
