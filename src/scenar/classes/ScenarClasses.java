/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scenar.classes;

/**
 *
 * @author BBARON
 */
public class ScenarClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*String marque = "Peugeot";
        String modele = "208";
        int annee = 2021;
        int prix = 14500;
        System.out.println("Voici une rapide présentation de la "+marque + modele +" sortie en "+annee + ". Elle est vendu au prix de "+prix+ "euros.");
        
        Voiture v1 = new Voiture();
        Voiture v2 = new Voiture();
        Voiture v3 =new Voiture();
        
        v1.marque="Peugeot"; v1.modele="208"; v1.annee=2021; v1.prix=14500;
        v2.marque="Toyota"; v2.modele="Yaris"; v2.annee=2015; v2.prix=9800;
        v3.marque="Renault"; v3.modele="Clio"; v3.annee=2000; v3.prix=3500;

        Voiture v1 = new Voiture("Peugeot","208",2021,14500);
        
        System.out.println(v1.marque+ v1.modele);
        
        Pneus p1= new Pneus (205,55,16,"Eté");
        
        System.out.println(p1.largeur+ p1.type);
        
        Voiture v1 = new Voiture("Peugeot","208",2021,14500,p1);
        
        System.out.println(v1.marque+" "+ v1.modele+ " "+v1.pneus.type);

        Pneus p1= new Pneus (205,55,16,"Eté");
        Voiture v1 = new Voiture("Peugeot","208",2021,14500,p1);
        
        System.out.println("Marque : "+v1.marque);
        System.out.println("Modèle : "+v1.modele);
        System.out.println("Année : "+v1.annee);
        System.out.println("Prix : "+v1.prix);
*/        
        Pneus p1= new Pneus (205,55,16,"Eté");
        Voiture v1 = new Voiture("Peugeot","208",2021,14500,p1);
        System.out.println("Voiture avant réduction de 10% :");
        v1.afficherDescription();
        
        System.out.println("Voiture après réduction de 10% :");
        v1.appliquerReduction10();
    }
    
}
