// un modelo que solo cuenta cosas y ya.... (incrementa en 1 o decrementa en 1) 
public class Modelo {
    
    private int count; 
    
    public Modelo(){
        this.count = 0;
    }
    public int getCount(){
        return count; 
    }
    public void increment(){
        count++;
    }
    public void decrement(){
        count--;
    }
    
}
