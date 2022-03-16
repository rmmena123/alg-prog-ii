import java.util.Scanner;
import java.math.BigInteger;
import java.util.Arrays;
// Utilizando a API Collections, a coleção utilizada como base possui os métodos de suporte implementados e seu tamanho é dinâmico, podendo armazenar a quantidade de elementos de acordo com a necessidade da aplicação e a capacidade do hardware.
import java.util.ArrayList; 
import java.util.List;  

public class Fila { 
    private final List dados = new ArrayList(); 

    public int primeiro() { 
        return this.dados.get(0);  
    } 

    public boolean ehVazia() {
        return this.dados.isEmpty();  
    } 

    public int tamanho() { 
        return this.dados.size();
    } 

    public void enfileira(int numero) { 
        this.dados.add(numero);  
    } 

    public int desenfileira() { 
        if(this.ehVazia()) { 
            throw new RuntimeException("A fila está vazia."); 
        }

        return this.dados.remove(0); 
    }
    
    @Override
    public String toString() { 
        return this.dados.toString(); 
    } 
} 

public class App {
    // A fila é conhecida com uma estrutura de dados FIFO (first-in first-out, em inglês), ou seja, o primeiro elemento que entra é o primeiro a sair
    /*
    ehVazia (isEmpty, em inglês): informa um resultado booleano dizendo se a fila contém algum elemento. 

    tamanho (length, em inglês): retorna a quantidade de elementos armazenados dentro da fila num determinado momento. 

    primeiro (front, em inglês): retorna o elemento que está na posição frontal da fila, porém este é um método de consulta, não remove o elemento. 

    enfileira (enqueue, em inglês): insere um elemento ao final da fila. Esse método deve receber como parâmetro o elemento que é inserido na fila.

    desenfileira (dequeue, em inglês): remove e retorna o elemento que está no início da fila. Uma regra importante nesse método é que nenhum elemento pode ser removido de uma lista vazia, portanto uma mensagem de erro deve retornar caso isso ocorra
    */
    public static void main(String[] args) {
        Fila f = new Fila(3); 
        System.out.printf("Fila atual: %s.\n", f.toString()); 

        try { 
            f.enfileira(29); 
            System.out.printf("Fila %s <= %s enfileirado.\n", f.toString(), 29);

            f.enfileira(10); 
            System.out.printf("Fila %s <= %s enfileirado.\n", f.toString(), 10);

            f.enfileira(83); 
            System.out.printf("Fila %s <= %s enfileirado.\n", f.toString(), 83);

            f.enfileira(36); 
            System.out.printf("Fila %s <= %s enfileirado.\n", f.toString(), 36);

        } catch (Exception e) { 
            System.err.println(e.getMessage()); 
        } 

        System.out.printf("Fila atual: %s.\n", f.toString()); 

        try { 
            System.out.printf("Desenfileirando %d <= fila %s.\n", f.desenfileira(), f.toString()); 
            System.out.printf("Desenfileirando %d <= fila %s.\n", f.desenfileira(), f.toString()); 
            System.out.printf("Desenfileirando %d <= fila %s.\n", f.desenfileira(), f.toString()); 
            System.out.printf("Desenfileirando %d <= fila %s.\n", f.desenfileira(), f.toString()); 
        } catch (Exception e) { 
            System.err.println(e.getMessage()); 
        } 
    }
        
}