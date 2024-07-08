package preesame1;

import java.util.Objects;

/**
 *
 * @author therealsimo24
 */
public abstract class Veicolo {
    
    private String targa;
    private int ingresso;
    private int uscita;
    
    public Veicolo(String targa){
        
        this.targa = targa;
        this.ingresso = 0;
        this.uscita = 0;
        
    }

    public int getIngresso() {
        return ingresso;
    }

    public void setIngresso(int ingresso) {
        this.ingresso = ingresso;
    }

    public int getUscita() {
        return uscita;
    }

    public void setUscita(int uscita) {
        this.uscita = uscita;
    }

    @Override
    public String toString() {
        return "Targa: " + targa;
    }    

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        final Veicolo other = (Veicolo) obj;
        return Objects.equals(this.targa, other.targa);
    }
    
    
    public abstract int calcolaPrezzo();
    
}
