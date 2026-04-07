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
public class Pneus {
    double largeur;
    double hauteurflan;
    double diamjante;
    String type;
    
    public Pneus(double largeur, double hauteurflan, double diamjante, String type){
        this.largeur=largeur;
        this.hauteurflan=hauteurflan;
        this.diamjante=diamjante;
        this.type=type;
    }
}
