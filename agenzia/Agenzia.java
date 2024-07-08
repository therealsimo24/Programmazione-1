/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agenzia;

import java.io.IOException;

/**
 *
 * @author valeria
 */
public class Agenzia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Azienda Eng = new Azienda("Engineering", "Cybersecurity", 1, false);
        Azienda Ikea = new Azienda("Ikea", "Design", 1, true);
        Candidato Rossi = new Candidato("Rossi", 34, "cv_Rossi.txt", Eng);
        Laureato Bianchi = new Laureato("Bianchi", 26, "cv_Bianchi.txt", Ikea);
        Candidato Elenco[] = new Candidato[2];
        String curriculum[] = new String[2];
        Elenco[0]=Rossi;
        curriculum[0]="cv_Rossi.txt";
        Elenco[1]=Bianchi;
        curriculum[1]="cv_Bianchi.txt";
        try {
          for(int i=0; i<2; i++) {
            Elenco[i].loadfromfile(curriculum[i]); //binding dinamico
            if (esamina_titoli(Elenco[i])) {
                  System.out.println("candidatura accettata");
                  if(Elenco[i].getDomanda().getOfferta().getLaureato()==true)
                      System.out.println("Laurea: " + ' ' + ((Laureato)Elenco[i]).getLaurea() + ' ' + "Voto:" + ((Laureato)Elenco[i]).getVoto());
            }
            else  System.out.println("candidatura NON accettata");
            }
         }   
        catch(IOException e) {
         System.out.println(e.getMessage());
      }
        
    } // fine main
    
    public static boolean esamina_titoli(Candidato C) {
    boolean idoneo=false;
    int i=0;
    if(C.getDomanda().getOfferta().getLaureato()==true && !(C instanceof Laureato)) return false;
    System.out.println(C.getNumTitoli());
       while(i<C.getNumTitoli() && !idoneo) {
          System.out.println(C.getTitoli()[i]);
        //  if(C.getTitoli()[i].matches(C.getDomanda().getOfferta()))
          if(matches(C.getTitoli()[i], C.getDomanda().getOfferta()))
          idoneo = true;
          else i++; 
       }
       return idoneo;
       }
    
     static boolean matches(Titolo T, Profilo P){
        if(T==null || P==null) return false;
        if (!(T instanceof Titolo) || !(P instanceof Profilo)) return false;
        return (T.getCompetenza().equals(P.getCompetenza()) && T.getEsperienza() >= P.getEsperienza());
    }
} //fine Agenzia


