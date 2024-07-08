package pre_esame2;

import java.util.Objects;

/**
 *
 * @author therealsimo24
 */
public abstract class Imbarcazione implements Comparable <Imbarcazione> {
    
    private int numPasseggeri;
    private int stazza;
    private String nome;

    public Imbarcazione(int numPasseggeri, int stazza, String nome) {
        this.numPasseggeri = numPasseggeri;
        this.stazza = stazza;
        this.nome = nome;
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
        final Imbarcazione other = (Imbarcazione) obj;
        return Objects.equals(this.nome, other.nome);
    }
    
    public abstract int notificaPasseggeri();

    public int getNumPasseggeri() {
        return numPasseggeri;
    }

    public double getStazza() {
        return stazza;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Imbarcazione con num Passeggeri: " + numPasseggeri + ", stazza: " + stazza + " e nome: " + nome + " di tipo ";
    }
    
    public int compareTo(Imbarcazione I){
        return (this.stazza - I.stazza);
    }
    
    
    
    
    
}
