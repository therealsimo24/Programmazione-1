/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework3;

/**
 *
 * @author domenico
 */
public class Zombie extends Personaggio {
    
    private static int ZombieCount = 0;
    
    public Zombie(int x, int y) {
        super(x, y);
        ZombieCount++;
    }
    
    @Override
    protected void die() { ZombieCount--; vivo=false;}
    
    public static int get_ZombieCount(){ return ZombieCount;}

    @Override
    public void move(Campo board) {
      if(vivo){
        // Implementazione del movimento per lo zombie, sempre avanti di una casella
        int currentX = getX();
        int currentY = getY();

        // Calcola le nuove coordinate per lo spostamento in avanti di una casella
        int newX = currentX + 1; 

        // Controlla se la nuova posizione è valida sulla board e che la cella destinazione non contenga un personaggio dello stesso tipo
        if (board.isValidPosition(newX, currentY) && (board.whois(newX, currentY) instanceof Zombie)==false) {
            board.removePersonaggio(currentX, currentY); // Rimuovi lo zombie dalla posizione corrente
            board.placePersonaggio(newX, currentY, this); // Sposta lo zombie alla nuova posizione
            this.setX(newX); // Aggiorna la coordinata x lo zombie
        } else {
            System.out.println("Movimento non valido per lo zombie!");
       
        }
      } 
    }//vivo 
}

