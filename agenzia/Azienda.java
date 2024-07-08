/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenzia;

/**
 *
 * @author valeria
 */
public class Azienda {
    private String denominazione; // contenimento stretto
    private Profilo offerta;  //contenimento stretto
    
    public Azienda(String denominazione, String competenza, int anniEsperienza, boolean laureato){
           denominazione = new String(denominazione);
           offerta = new Profilo(competenza, anniEsperienza, laureato);
    }
    
    public Profilo getOfferta() {return offerta;}  
}
