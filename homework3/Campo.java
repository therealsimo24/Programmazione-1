
package homework3;

/**
 *
 * @author domenico
 */

public class Campo {
    private final Personaggio[][] grid; // Griglia per contenere i personaggi

    public Campo(int size) {
        grid = new Personaggio[size][size];
    }

    // Metodo per posizionare un personaggio sulla board
    public void placePersonaggio(int x, int y, Personaggio personaggio) {
        if(grid[x][y]!=null) grid[x][y].die(); //presa. è qui che l'eventuale pezzo precedente viene mangiato
        grid[x][y] = personaggio;
    }

    // Metodo per rimuovere un personaggio dalla board
    public void removePersonaggio(int x, int y) {
        grid[x][y] = null;
    }

    public Personaggio[][] getGrid() {
        return grid;
    }

    // Metodo per controllare se una posizione è valida sulla board
    public boolean isValidPosition(int x, int y) {
        return x >= 0 && x < grid.length && y >= 0 && y < grid[0].length;
    }
    
    public Personaggio whois(int x, int y) {
        return grid[x][y];
    }

    // Metodo per controllare se la partita è finita per vittoria di uno dei due personaggi
    public boolean gameover() {
        return (Alien.get_AlienCount()==0 || Zombie.get_ZombieCount()==0);
    }

}
