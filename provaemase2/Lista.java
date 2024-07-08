package provaemase2;

import java.util.ArrayList;

/**
 *
 * @author therealsimo24
 */
public class Lista {
    
    class Nodo{
        
        private Multimedia data;
        private Nodo next;
        
        public Nodo(Multimedia e){
            this.data = e;
            this.next = null;
        }
        
    }
    
    Nodo testa;
    
    public void push(Multimedia e){
        Nodo q = new Nodo(e);
        q.next = testa;
        testa = q;
    }
    
    public Multimedia pop(){
        Multimedia e = testa.data;
        testa = testa.next;
        return e;
    }
    
    public void stampa(){
        
        Nodo temp = testa;
        
        while(temp!= null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    
    public void delete(Multimedia e){
        if(testa.data.equals(e)) pop();
        else{
            Nodo temp = testa;
            while(!temp.next.data.equals(e)) temp =temp.next;
            temp.next = temp.next.next;
        }
    }
    
    public void deleteAll(Multimedia e) {
        
        while (testa != null && testa.data.equals(e)) {
            pop(); // Rimuove tutti i nodi iniziali uguali a e
        }
        
        if(testa.data.equals(e)) pop();
        else{
            Nodo temp = testa;
            while(!temp.next.data.equals(e)) temp =temp.next;
            temp.next = temp.next.next;
        }
    }
        
    public void saveSpace(){
        
        Nodo temp = testa;
        while(temp!= null){
            if(temp.data instanceof Video && temp.data.checkQuality()){
                temp.data.resize(50);
            }
            temp = temp.next;
        }
    }
    
    public int counterVideo(){
        Nodo temp = testa;
        int counterV = 0;
        while(temp!= null){
            if(temp.data instanceof Video && !temp.data.checkQuality()){
                counterV++;
            }
            temp = temp.next;
        }
        return counterV;
    }
    
    
    public void removeLow(Lista L){
        
        Nodo temp = testa;
        int counterI = 0;
        int counterV = 0;
        
        while(temp!= null){
            
            if(temp.data instanceof Image && !temp.data.checkQuality() && counterI < 2){
            
                L.delete(temp.data);
                counterI++;
            }
            temp = temp.next;
        }
        
        temp = testa;
        
        ArrayList <Nodo> A = new ArrayList<>();
        
        while(temp!= null){
            A.add(temp);
            temp = temp.next;
        }
        
        for(int i = (A.size()-1); i >= 0 && counterV < 2; i--){
            Nodo q = A.get(i);
            if(q.data instanceof Video && !q.data.checkQuality()){
                L.delete(q.data);
                counterV++;
            }
        }
        
        
    }
    

    
}
