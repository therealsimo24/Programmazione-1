/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenzia;

/**
 *
 * @author valeria
 */
public class Titolo {
    String competenza;
    int anniesperienza;
    
    Titolo(String e, int anni) {
    competenza = new String(e);
    anniesperienza = anni;
    }
    
    String getCompetenza(){return competenza;}
    int getEsperienza(){return anniesperienza;}
   /* boolean matches(Profilo P){
        if(this==null || P==null) return false;
        if (!(P instanceof Profilo)) return false;
        return (competenza.equals(P.getCompetenza()) && anniesperienza >= P.getEsperienza());
    }*/
    @Override
    public String toString(){return competenza + ' ' + anniesperienza;}
}
