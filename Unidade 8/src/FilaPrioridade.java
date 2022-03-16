import java.util.ArrayList;
import java.util.List;

public class FilaPrioridade {
    private List itens = new ArrayList(); 

    public boolean ehVazia() { 
        return this.itens.isEmpty(); 
    } 

    public int tamanho() { 
        return this.itens.size(); 
    } 
 
     public void enfileira(Item i) { 
        this.itens.add(i); 
    } 
 
     public Item desenfileira() { 
        if(this.ehVazia()) { 
            throw new RuntimeException("A fila está vazia."); 
        } 

        Item altaPrioridade = (Item) this.itens.get(0); 
        for(Item i : this.itens) { 
            if(i.getPrioridade() < altaPrioridade.getPrioridade()) { 
                altaPrioridade = i; 
            } 
        } 
  
        this.itens.remove(altaPrioridade); 
        return altaPrioridade; 
    } 

    @Override 
    public String toString() { 
        return this.itens.toString(); 
    } 
}

      

