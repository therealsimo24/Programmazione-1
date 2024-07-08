
package homework3;

/**
 *
 * @author domenico
 */

public abstract class Personaggio {
   
    private int x; // Coordinata x sulla board
    private int y; // Coordinata y sulla board
    protected boolean vivo;

    public Personaggio(int X, int Y) {
        this.x = X;
        this.y = Y;
        this.vivo=true;
    }

    public int getX() {
        return x;
    }

    public void setY(int Y) {
        y=Y;
    }
    
    public void setX(int X) {
        x=X;
    }

    public int getY() {
        return y;
    }
    
    // Metodo per muovere il personaggio
    public abstract void move(Campo board);
    
    // Metodo PROTETTO per effettuare la presa
    protected abstract void die();

}

