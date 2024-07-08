package preesame1;

/**
 *
 * @author therealsimo24
 */
public class Parcheggio {
    
    private final int MAXAUTO = 3;
    private final int MAXMOTO = 2;
    private int numAuto;
    private int numMoto;
    private final CodaVeicoli codaIngresso;
    private final Veicolo[] veicoliPresenti;
    
    public Parcheggio(){
        
        this.numAuto = 0;
        this.numMoto = 0;
        this.codaIngresso = new CodaVeicoli();
        this.veicoliPresenti = new Veicolo[MAXAUTO+MAXMOTO];
        
    }
    
   // public class Parcheggio {
    public void accetta(Veicolo v) throws EccezioneCodaAttesa{
        
        if(v instanceof Motociclo){
            if(numMoto < MAXMOTO){
                //numMoto++;
                codaIngresso.append(v);
            }else {
                throw new EccezioneCodaAttesa("Posti moto terminati.");
            }
        }else{
            
            if(numAuto < MAXAUTO){
                //numAuto++;
                codaIngresso.append(v);
            }else{
                throw new EccezioneCodaAttesa("Posti auto terminati.");
            }
        }
    }
    
    public Veicolo faiEntrare(int oraingresso){
        
        Veicolo v = codaIngresso.pop();
        v.setIngresso(oraingresso);
        return v;
        
    }
    
    public void parcheggia(Veicolo v){
        
        veicoliPresenti[numAuto+numMoto] = v;
        if (v instanceof Motociclo){
            numMoto++;
        }else{ 
            numAuto++;
        }
    }
    
    public boolean postoDisponibile(Veicolo v){
        
      if (v instanceof Automobile) return numAuto<MAXAUTO;
        else return numMoto<MAXMOTO;
    }
    
    public void uscita(Veicolo v, int oraUscita){
        
        int posizione = cerca(v);
        
        if(posizione > -1){
            
            veicoliPresenti[posizione].setUscita(oraUscita);
            System.out.println("Uscita "+veicoliPresenti[posizione].toString());
            System.out.println("Prezzo da pagare: " + veicoliPresenti[posizione].calcolaPrezzo());
            rimuoviVeicolo(posizione);
        }
        
        if(v instanceof Motociclo) numMoto--;
        else numAuto--;
        
        
    }
    
    private int cerca(Veicolo v){
        int pos = 0;
        while(pos<numAuto+numMoto) {
            if(veicoliPresenti[pos].equals(v)){
                return pos;
            } else pos++;
        }
        return -1;
    }
    
    //metodo privato che libera la posizione di un veicolo che sta sta lasciando il parcheggio.
    private void rimuoviVeicolo (int posizione){
        for (int i=posizione; i<numAuto+numMoto-1; i++){
            veicoliPresenti[i]=veicoliPresenti[i+1];
        }
    }
    
    public boolean codaAttesaPiena(){
        
        return codaIngresso.isFull();
    }
}
