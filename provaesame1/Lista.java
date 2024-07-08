package provaesame1;

import java.util.ArrayList;

/**
 *
 * @author therealsimo24
 */
public class Lista {
    
    class Nodo{
    private Vulnerability data;
    private Nodo next;

    Nodo(Vulnerability e) {
        this.data = e;
        this.next = null;
    }
    
    }
    
    Nodo testa;
    
    Lista(){
        testa = null;
    }
    
    public void push(Vulnerability e){
        Nodo q = new Nodo(e);
        q.next = testa;
        testa = q;
    }
    
    public boolean isEmpty(){
        return testa == null;
    }
    
    public boolean isFull(){
        return false;
    }
    
    public void append(Vulnerability e){
        
        if( isEmpty() ){
            push(e);
        }else{
            Nodo temp = testa;
            Nodo q = new Nodo(e);
            while (temp.next != null) temp = temp.next;
            temp.next = q;
        }
        
        
    }
    
    public void stampa(){
        Nodo temp = testa;
        while(temp!= null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    
    public Vulnerability pop(){
        Vulnerability e = testa.data;
        testa = testa.next;
        return e;
    }
    
    /*public ArrayList<Vulnerability> toArrayList(){
        
        ArrayList <Vulnerability> arrayList = new ArrayList<>();
        Nodo temp = testa;
        while(temp!= null){
            arrayList.add(temp.data);
            temp = temp.next;
        }
        
        return arrayList;
    }
    */
    
    public ArrayList <Integer> numberExploitable(){
        
        int counterH = 0;
        int counterS = 0;
        Nodo temp = testa;
        while(temp!= null){
            
            if((temp.data instanceof SWVulnerability) && (temp.data.checkExploitable())){
                counterS++;
            }
               
            if((temp.data instanceof HWVulnerability) && (temp.data.checkExploitable())){
                counterH++;
            }
            
            temp = temp.next;
                    
        }
        
       ArrayList<Integer> arraylist = new ArrayList<>(2);
       arraylist.add(counterS);
       arraylist.add(counterH);
       return arraylist;
    }
    
    public void delete(Vulnerability e){
        if(testa.data == e) pop();
        else{
            Nodo temp = testa;
            while(temp.next.data!= e) temp= temp.next;
            temp.next = temp.next.next;
        }
    }
            
    public void removeNotExploitable(){
        
        Nodo temp = testa;
        while(temp!=null){

        if(!temp.data.checkExploitable()){
            delete(temp.data);
       
         }
            temp = temp.next;
        }
    }
}