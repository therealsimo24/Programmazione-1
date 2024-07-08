package preesame1;

/**
 *
 * @author therealsimo24
 */
public class Automobile extends Veicolo {
    
    public Automobile(String targa){
        
        super(targa);
        
    }
    
    @Override
    public int calcolaPrezzo(){
        
        return (super.getUscita()- super.getIngresso()+1)*4;
        
    }
    
    @Override
    public String toString() {
        return "di un'Automobile: " + super.toString() ;
    }
    
}
