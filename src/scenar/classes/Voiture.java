package scenar.classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BBARON
 */
public class Voiture {
    String marque;
    String modele;
    int annee;
    double prix;
    Pneus pneus;
    
    public Voiture(String marque, String modele, int annee, double prix, Pneus pneus){
        this.marque=marque;
        this.modele=modele;
        this.annee=annee;
        this.prix=prix;
        this.pneus=pneus;
    }
    public void afficherDescription(){
        System.out.println("Marque : "+marque);
        System.out.println("Modèle : "+modele);
        System.out.println("Année : "+annee);
        System.out.println("Prix : "+prix+ " €");
    }
}
