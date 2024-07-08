
package homework3;

/**
 *
 * @author domenico
 */

public class ZombiesVSAliens {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creazione della board che deve essere di dimensione 5x5
        Campo board = new Campo(5); // Campo di dimensione 5x5

        // La partita consiste di 8 mosse
        Personaggio sequenza_mosse[] = new Personaggio[8];
        
/*
       // Creazione dei personaggi: 2 alieni e 2 pedine e loro coordinate iniziali
        Personaggio zombie1 = new Zombie(0, 2);
        Personaggio zombie2 = new Zombie(0, 3);
        Personaggio alien1 = new Alien(0, 0);
        Personaggio alien2 = new Alien(0, 1);
       
        //Posizionamento dei personaggi sulla board, 
        //coerente con le coordinate iniziali
        board.placePersonaggio(0, 2, zombie1);
        board.placePersonaggio(0, 3, zombie2);
        board.placePersonaggio(0, 0, alien1);
        board.placePersonaggio(0, 1, alien2);
       */ 
        
        // TEST0: limiti della board, in questa configurazione
        // iniziale nessuno può muoversi
       
        Personaggio zombie1 = new Zombie(4, 2);
        Personaggio zombie2 = new Zombie(4, 3);
        Personaggio alien1 = new Alien(4, 0);
        Personaggio alien2 = new Alien(4, 1);
        
        board.placePersonaggio(4, 2, zombie1);
        board.placePersonaggio(4, 3, zombie2);
        board.placePersonaggio(4, 0, alien1);
        board.placePersonaggio(4, 1, alien2);
       
        
        /* TEST 1: le ultime due mosse devono essere skippate perchè il personaggio
        zombie1 a quel punto è morto, patta
        sequenza_mosse[0]=alien1;
        sequenza_mosse[1]=zombie1;
        sequenza_mosse[2]=alien2;
        sequenza_mosse[3]=zombie2;
        sequenza_mosse[4]=alien1;
        sequenza_mosse[5]=alien1;
        sequenza_mosse[6]=zombie1;
        sequenza_mosse[7]=zombie1;
         */
        
        /* TEST 2: vincono gli alieni 
        sequenza_mosse[0]=alien1;
        sequenza_mosse[1]=zombie1;
        sequenza_mosse[2]=alien2;
        sequenza_mosse[3]=zombie2;
        sequenza_mosse[4]=zombie2;
        sequenza_mosse[5]=alien2;
        sequenza_mosse[6]=zombie2;
        sequenza_mosse[7]=zombie2;
       */
        
         /* TEST 3: vincono le pedine
        sequenza_mosse[0]=alien1;
        sequenza_mosse[1]=alien2;
        sequenza_mosse[2]=zombie1;
        sequenza_mosse[3]=zombie2;
        sequenza_mosse[4]=alien1;
        sequenza_mosse[5]=alien1;
        sequenza_mosse[6]=zombie2;
        sequenza_mosse[7]=zombie2;
         */
         
         /* TEST 4: patta dopo 8 mosse reali */
        sequenza_mosse[0]=zombie1;
        sequenza_mosse[1]=zombie2;
        sequenza_mosse[2]=zombie1;
        sequenza_mosse[3]=zombie2;
        sequenza_mosse[4]=zombie1;
        sequenza_mosse[5]=zombie2;
        sequenza_mosse[6]=alien1;
        sequenza_mosse[7]=alien2;
        
        // Stampa della board nello stato iniziale
       System.out.println("Stato iniziale");
       printBoardState(board);
       System.out.println("numero di alieni" + Alien.get_AlienCount());
       System.out.println("numero di pedine" + Zombie.get_ZombieCount());
        
       
        int i=0;
        while(i<sequenza_mosse.length && !board.gameover()) {
            sequenza_mosse[i].move(board);
            System.out.println("Stampa della board dopo la mossa");
            printBoardState(board);
            System.out.println("numero di alieni" + Alien.get_AlienCount());
            System.out.println("numero di pedine" + Zombie.get_ZombieCount());
            i++;
        }
        if (Alien.get_AlienCount()==0) System.out.println("Hanno vinto gli zombie!");
        else if (Zombie.get_ZombieCount()==0) System.out.println("Hanno vinto gli alieni!");
        else System.out.println("Partita patta dopo " + sequenza_mosse.length + " mosse!");
        
    }

    // Metodo per stampare lo stato attuale della board
    private static void printBoardState(Campo board) {
        Personaggio[][] grid = board.getGrid();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                Personaggio giocatore = grid[i][j];
                if (giocatore instanceof Zombie) {
                    System.out.print("Z ");
                } else if (giocatore instanceof Alien) {
                    System.out.print("A ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
    
}
