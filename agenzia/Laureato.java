/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenzia;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author valeria
 */
public class Laureato extends Candidato {
    
    private String Laurea;
    private int voto;
    
    public Laureato(String N, int e, String CV, Azienda A) {
        super(N,e,CV,A);
        Laurea = null;
        voto = 0;
    }
    
     public int getVoto()  {return voto;}
     public String getLaurea()  {return Laurea;}
     
   @Override
   public void loadfromfile(String curriculum) throws IOException {
       
       Scanner input = new Scanner(Paths.get(curriculum));
       Laurea = new String(input.next());
       voto = input.nextInt();
       n_titoli = input.nextInt();
       System.out.println(n_titoli);
       Competenze = new Titolo[n_titoli];
       for(int i=0; i<n_titoli; i++) {
           Competenze[i]= new Titolo(input.next(),input.nextInt());
           //System.out.println(Competenze[i]);
       }
       
   }
}
