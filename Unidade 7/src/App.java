import java.util.ArrayList; 
import java.util.List; 

public class Pilha { 
  private List dados = new ArrayList(); 

  public Pilha(int i) {
  }

  public boolean ehVazia() { 
    return this.dados.isEmpty(); 
  } 

  public int topo() { 
    return (int) this.dados.get(this.dados.size() - 1); 
  } 

  public int tamanho() { 
    return this.dados.size(); 
  } 

  public void empilha(int numero) { 
    this.dados.add(numero); 
  } 

  public int desempilha() { 
    if(this.ehVazia()) { 
      throw new RuntimeException("A pilha está vazia."); 
    }

    return (int) this.dados.remove(this.dados.size() - 1); 
  } 

  @Override 
  public String toString() { 
    return this.dados.toString(); 
  } 
}


public class App { 
  public static void main(String[] args) { 

    Pilha p = new Pilha(3); 
    System.out.printf("Pilha vazia: %s\n" , p.toString()); 

    try { 
      p.empilha(29); 
      System.out.printf("Empilha: %s <= %d\n", p.toString(), 29);

      p.empilha(42); 
      System.out.printf("Empilha: %s <= %d\n", p.toString(), 42);

      p.empilha(10); 
      System.out.printf("Empilha: %s <= %d\n", p.toString(), 10);

      p.empilha(83); 
      System.out.printf("Empilha: %s <= %d\n", p.toString(), 83); 
      } catch (RuntimeException e) { 
        System.err.println(e.getMessage()); 
    } 

    System.out.printf("Pilha cheia: %s\n", p.toString()); 

    try { 
      System.out.printf("Desempilha: %s => %d\n", p.toString(), p.desempilha()); 
      System.out.printf("Desempilha: %s => %d\n", p.toString(), p.desempilha()); 
      System.out.printf("Desempilha: %s => %d\n", p.toString(), p.desempilha()); 
      System.out.printf("Desempilha: %s => %d\n", p.toString(), p.desempilha()); 
    } catch (RuntimeException e) { 
      System.err.println(e.getMessage()); 
    } 
  } 
} 