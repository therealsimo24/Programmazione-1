
package homework3;

/**
 *
 * @author domenico
 */

public class Alien extends Personaggio {
    
    private static int AlienCount=0;
    
    public Alien(int x, int y) {
        super(x, y);
        AlienCount++;
    }
    
    @Override
    protected void die() { AlienCount--; vivo=false;}
    
    public static int get_AlienCount(){ return AlienCount;}

    @Override
    public void move(Campo board) {
      if(vivo){
        //l'alieno si muove solo in avanti in obliquo di una posizione verso destra
        int currentX = getX();
        int currentY = getY();

        // Calcola le nuove coordinate per lo spostamento in avanti a destra
        int newX = currentX + 1; // Spostamento in avanti
        int newY = currentY + 1; // Spostamento a destra

        // Controlla se la nuova posizione è valida sulla board e che la cella destinazione non contenga un personaggio dello stesso tipo
        if (board.isValidPosition(newX, newY) && (board.whois(newX, newY) instanceof Alien)==false) {
            board.removePersonaggio(currentX, currentY); // Rimuovi l'alieno dalla posizione corrente
            board.placePersonaggio(newX, newY, this); // Sposta l'alieno alla nuova posizione
            this.setX(newX);
            this.setY(newY);
        } else {
            System.out.println("Movimento non valido per l'alieno!");
        }
    }
  }//vivo
    
}

