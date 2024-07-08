
package preesame1;

/**
 *
 * @author therealsimo24
 */
public class Utente {

    public static void main(String[] args) {
        

        Parcheggio p = new Parcheggio();
        Motociclo m1 = new Motociclo("ED564TY");
        Motociclo m2 = new Motociclo("ST999ZX");
        Motociclo m3 = new Motociclo("FW192YY");
        Motociclo m4 = new Motociclo("YU765YE");
         
        Automobile a1 = new Automobile("ED567KY");
        Automobile a2 = new Automobile("AA564TY");
        Automobile a3 = new Automobile("BC711UY");
        Automobile a4 = new Automobile("ZX111CV");
        Automobile a5 = new Automobile("PO526KS");
        Automobile a6 = new Automobile("ST001TY");
        
           try {
            if (!p.codaAttesaPiena()) p.accetta(m1);
            if (!p.codaAttesaPiena()) p.accetta(m2);
            if (!p.codaAttesaPiena()) p.accetta(a1);
            if (!p.codaAttesaPiena()) p.accetta(a2);
            if (!p.codaAttesaPiena()) p.accetta(a3);
            if (!p.codaAttesaPiena()) p.accetta(a4);
            
            Veicolo v = p.faiEntrare(12);
            p.parcheggia(v);
            v=p.faiEntrare(13);
            p.parcheggia(v);
            v=p.faiEntrare(13);
            p.parcheggia(v);
            v=p.faiEntrare(13);
            p.parcheggia(v);
            Automobile v1 = new Automobile("ED567KY");
            p.uscita(v1, 16);
        } catch (EccezioneCodaAttesa e) {
            System.out.println(e.getMessage());
            
        }
    }

}
