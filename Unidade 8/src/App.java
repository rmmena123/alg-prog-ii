// Pode-se entender que a fila de prioridade é uma extensão da fila tradicional, na qual é atribuído um valor de prioridade para o elemento armazenado. Um elemento, ou classe, deve ser criado para que seja atribuída a prioridade de cada item da fila. Ele deve armazenar o objeto do tipo da fila e um valor inteiro que represente a sua prioridade. A prioridade mais alta de uma fila é dada pelo seu menor inteiro, em outras palavras, o valor 0 é o elemento de maior prioridade dentro da fila. Ele deve ser removido primeiro. No caso da existência de diversos itens com a mesma prioridade, é importante ressaltar que os itens devem se comportar como uma fila tradicional.
/*
FilaPrioridade(): cria uma fila de prioridade sem restrições. 

FilaPrioridade(limite): cria uma fila de prioridade restrita, em que o intervalo é iniciado em 0 e vai até o limite informado como parâmetro. 

ehVazia (isEmpty, em inglês): informa um resultado booleano dizendo se a pilha possui algum elemento armazenado ou não. 

tamanho (length, em inglês): retorna à quantidade de elementos/itens armazenados no momento da consulta.

enfileira (item, prioridade) (enqueue, em inglês): insere um elemento/item na fila de acordo com a prioridade informada. A prioridade deve estar dentro do intervalo limitante, nos casos de filas restritas. 

desenfileira (dequeue, em inglês): remove e retorna o elemento que está no início da fila de prioridade. Esse elemento possui o maior grau de prioridade. É importante também verificar se a fila não está vazia antes de realizar essa operação.
*/

// Para balancear a implementação de uma fila de prioridade, utiliza-se uma estrutura de dados chamada heap. O tempo das operações de inserção e remoção de dados em um heap é de O(log(n)).

public class App { 
  public static void main(String[] args) { 
    FilaPrioridade f = new FilaPrioridade(6);

    try { 
      f.enfileira(new Item("roxo", 5)); 
      f.enfileira(new Item("preto", 1)); 
      f.enfileira(new Item("laranja", 0)); 
      f.enfileira(new Item("branco", 4)); 
      f.enfileira(new Item("verde", 1)); 
      f.enfileira(new Item("amarelo", 3)); 
    } catch(RuntimeException e) { 
      System.err.println(e.getMessage()); 
    }

    System.out.printf("%s\n\n", f); 

    try { 
      while(!f.ehVazia()) { 
      System.out.println(f. desenfileira()); 
      } 
    } catch(RuntimeException e) { 
      System.err.println(e.getMessage()); 
    } 
  } 
} 