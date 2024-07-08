/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenzia;

/**
 *
 * @author valeria
 */
public class Profilo {
    
    private String competenza;
    private int anniEsperienza;
    private boolean laureato;
    
    
    
    Profilo(String cpt, int anni, boolean l) {
    competenza = new String(cpt);
    anniEsperienza = anni;
    laureato = l;
    }
    
    String getCompetenza(){return competenza;}
    int getEsperienza(){return anniEsperienza;}
    boolean getLaureato(){return laureato;}
    
    
}
