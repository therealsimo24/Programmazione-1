package pre_esame2;

/**
 *
 * @author therealsimo24
 */
public class PortaContainer extends Imbarcazione{
    
    private int numContainer;

    public PortaContainer(int numContainer, int numPasseggeri, int stazza, String nome) {
        super(numPasseggeri, stazza, nome);
        this.numContainer = numContainer;
    }

    @Override
    public int notificaPasseggeri() {
       return super.getNumPasseggeri() + (numContainer*2);
    }

    @Override
    public String toString() {
        return super.toString()+"Porta Container, con numero container: "+ numContainer;
    }

    public int getNumContainer() {
        return numContainer;
    }
    
    
    
    
    
}
