
package provaemase2;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author therealsimo24
 */
public class Galleria {

    public static void main(String[] args) throws IOException {
        
        Lista L = new Lista();
        
        leggiDaFile(L);
        
        System.out.println("Elementi presenti nella galleria:");
        L.stampa();
        
        System.out.println("\nUtilizzo Save Space:");
        L.saveSpace();
        L.stampa();
        
        L.removeLow(L);
        System.out.println("\nLista senza le prime due image low quality e gli ultimi due video low quality: ");
        L.stampa();
        
    }
    
    public static void leggiDaFile(Lista L) throws IOException{
        
        Scanner input = new Scanner(Paths.get("Galleria.txt"));
        int dim = input.nextInt();
        for(int i = 0; i < dim; i++){
            String className;
            className = input.next();
            if(className.equals("Video")){
                L.push(new Video(input.nextInt(), input.next(), input.next().charAt(0), input.nextBoolean()));
            }else{
                L.push(new Image(input.nextInt(), input.nextInt(), input.next(), input.next().charAt(0), input.nextBoolean()));
            }
        }

        input.close();
    }

}
