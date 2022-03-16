public class Item<T> {
  private T valor; 
  private int prioridade; 
 
  public Item(T valor, int prioridade) { 
    this.valor = valor; 
    this.prioridade = prioridade; 
  } 
 
  public T getValor() { 
    return valor; 
  } 
 
  public int getPrioridade() { 
    return prioridade; 
  } 
 
  @Override 
  public String toString() { 
    return String.format("(%d - %s)", this.prioridade, this.valor.toString()); 
  } 
}
