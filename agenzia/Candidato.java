/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenzia;

/**
 *
 * @author valeria
 */
import java.io.*;
import java.nio.file.Paths;
import java.util.Scanner;

public class Candidato implements Loadable {
    
   private String Cognome;
   private int eta;
   private String Curriculum;  //nome file
   private Azienda Candidatura; // contenimento lasco
   Titolo Competenze[];
   int n_titoli;
   
   
   public Candidato(String Cognome, int e, String CV, Azienda A) {
          Cognome = new String(Cognome); eta = e;
          Curriculum = new String(CV);
          Candidatura = A;
          n_titoli = 0;
          Competenze = null;
   }
   
   @Override
   public void loadfromfile(String curriculum) throws IOException {

    Scanner input = new Scanner(Paths.get(curriculum));

       n_titoli = input.nextInt();
       System.out.println(n_titoli);
       Competenze = new Titolo[n_titoli];
       for(int i=0; i<n_titoli; i++) {
           Competenze[i]= new Titolo(input.next(),input.nextInt());
           //System.out.println(Competenze[i]);
       }
     }
   
   public Azienda getDomanda()  {return Candidatura;}
   public int getNumTitoli()  {return n_titoli;}
   public Titolo[] getTitoli()  {return Competenze;}
  
}
