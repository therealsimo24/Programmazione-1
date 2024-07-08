
package pre_esame2;

import java.util.ArrayList;


/**
 *
 * @author therealsimo24
 */
public class CompagniaNavigazione {

    public static void main(String[] args) {
        
        OrderedLinkedList L = new OrderedLinkedList();
        ArrayList <Imbarcazione> A = new ArrayList<>();
        int max;
        
        
        Imbarcazione I1 = new Traghetto(100, 00, 20, "Santa Lucia");
        Imbarcazione I2 = new Traghetto(100, 90, 20, "Nina");
        Imbarcazione I3 = new PortaContainer(60, 90, 20, "Pinta");
        Imbarcazione I4 = new PortaContainer(40, 00, 20, "Arca");
        
        L.inserisci(I1);
        L.inserisci(I2);
        L.inserisci(I3);
        L.inserisci(I4);
        
        L.stampa();
        max = L.ricercaMassimo();
        
        System.out.println("Numero massimo di persone presenti su un'Imbarcazione: "+ max);
        
        A = L.imbarcazioniAfollate(max);
        
        System.out.println("Imbarcazioni con max nummero passeggeri: ");
        
        System.out.println(A.toString());
        
        
        
        
        
        
    }

}
