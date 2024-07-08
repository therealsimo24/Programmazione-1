package pre_esame2;
import java.util.ArrayList;

/**
 *
 * @author therealsimo24
 */
public class OrderedLinkedList {
    
    
    class Nodo{
    private Imbarcazione data;
    private Nodo next;
    
    
    Nodo(Imbarcazione e){
       this.data = e;
       this.next = null;
    }
    }
    
    Nodo testa;
    
    OrderedLinkedList(){
        this.testa = null;
    }
    
    public void push(Imbarcazione e){
        Nodo q = new Nodo(e);
        q.next = testa;
        testa = q;
    }
    
    public Imbarcazione pop(){
        Imbarcazione e = testa.data;
        testa = testa.next;
        return e;
    }
    
    //o si usa questo o il push
    public void append(Imbarcazione e){
        if(isEmpty()){
            push(e);
        }else{
            Nodo temp = testa;
            Nodo q = new Nodo (e);
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = q;
        }
    }
    
    public boolean isEmpty(){
        return testa == null;
    }
    
    public boolean isFull(){
        return false;
    }
    
    public boolean inLista(Imbarcazione e) {
        boolean trovato = false;
        Nodo temp = testa;
        while(temp!=null && !trovato){
            if(temp.data.equals(e)){
                trovato = true;
            }else{
                temp = temp.next;
            }
        }
        return trovato;
    }
    
    public boolean isOrdered(){
        boolean ordinato = true;
        Nodo temp = testa;
        
        if(temp == null) return true;
        if(temp.next == null) return true;
        if(temp.next.next == null){
            return temp.data.compareTo(temp.next.data)<=0;
        }
        
        while(ordinato && temp.next.next!= null){
            if(temp.data.compareTo(temp.next.data)>0){
                ordinato = false;
            }else{
                temp = temp.next;
            }
        }
        return ordinato;
    }
    
    //ordinamento natuale
     public void inserisci(Imbarcazione e){
       if(isEmpty() || (testa.data.compareTo(e)>=0)){
           
           push(e);
           
       }else{
           
             Nodo temp = testa;
             Nodo q = new Nodo(e);
             while((temp.next != null) && temp.next.data.compareTo(e)<0){
                 temp = temp.next;
             }
             q.next = temp.next;
             temp.next = q;
       }
    }
    
    public void delete(Imbarcazione e){
        if(!this.inLista(e)){
            System.out.println("Imbarcazione non presente in lista.");
        }else{
            
        if(testa.data.equals(e)) pop();
        else{
            Nodo temp = testa;
            while(!temp.next.data.equals(e)) temp= temp.next;
            temp.next = temp.next.next;
        }
        }
    }
    
    public void stampa(){
        int j = 1;
        Nodo temp = testa;
        while(temp !=null){
            System.out.println(j + " "+temp.data);
            temp = temp.next;
            j++;
        }
    }
    
    public int numeroContainerInNavigazione(){
        
        Nodo temp = testa;
        int somma = 0;
        while(temp!=null){
            
            if(temp.data instanceof PortaContainer){
                PortaContainer PC = (PortaContainer) temp.data;
                somma = somma + PC.getNumContainer();
            }
            
            temp = temp.next;
        }
        
        return somma;
    }

    public int ricercaMassimo(){
        
        Nodo temp = testa;
        int max = testa.data.getNumPasseggeri();
        
        while(temp!=null){
            
            if(temp.data.getNumPasseggeri() > max){
                max = temp.data.getNumPasseggeri();
            }
            temp = temp.next;
        }
        
        return max;
    }
    
    
    public ArrayList<Imbarcazione> imbarcazioniAfollate(int max){
        
        ArrayList <Imbarcazione> A = new ArrayList<>();
        
        Nodo temp = testa;
        
        while(temp!= null){
            
            if(temp.data.getNumPasseggeri() == max){
                
                A.add(temp.data);
                
            }
            temp = temp.next;
        }
        
        return A;
    }
    
    
    

    
}
