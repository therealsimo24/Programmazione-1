package preesame1;


/**
 *
 * @author therealsimo24
 */
public class CodaVeicoli {
    
    private int testa;
    private int coda;
    private int nelem;
    private int max;
    private Veicolo[] C;
    
    public CodaVeicoli(){
        
         max = 5;
         nelem = 0;
         testa = coda = 0;
         C = new Veicolo[max];
         
    }
    
    public void append(Veicolo e){
        
        C[coda] = e;
        coda = (coda+1)%max;
        nelem++;
    }
    
    public Veicolo pop(){
        
        Veicolo e = C[testa];
        testa = (testa +1)%max;
        nelem--;
        return e;
        
    }
    
    public boolean isEmpty(){
        return nelem == 0;
    }
    
    public boolean isFull(){
        return nelem == max;
    }
    
    public void printCoda(){
        for(int i = 0; i < nelem; i++){
            System.out.println(C[(testa+i)%max]+" ");
        }
    }
    
}
