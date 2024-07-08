package preesame1;

/**
 *
 * @author therealsimo24
 */
public class Motociclo extends Veicolo{
    
    public Motociclo(String targa){
        
        super(targa);
        
    }
    
    @Override 
    public int calcolaPrezzo(){
        
        return (super.getUscita() - super.getIngresso()+1)*2;
        
    }

    @Override
    public String toString() {
        return "di un Motociclo: " + super.toString() ;
    }
    
    
    
}
