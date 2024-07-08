package pre_esame2;

/**
 *
 * @author therealsimo24
 */
public class Traghetto extends Imbarcazione {
    
    private int numAutomobili;

    public Traghetto(int numAutomobili, int numPasseggeri, int stazza, String nome) {
        super(numPasseggeri, stazza, nome);
        this.numAutomobili = numAutomobili;
    }
    
    @Override
    public int notificaPasseggeri(){
        return this.numAutomobili + super.getNumPasseggeri();
    }
    
    @Override
    public String toString() {
        return super.toString()+ "Traghetto, con numero automobili: "+ numAutomobili;
    }
    
    
}
