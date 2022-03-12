import java.util.Scanner;

public class App {
    // Busca Sequencial
    // Percorre o vetor do primeiro ao último valor, sequencialmente, em busca do elemento passado por parâmetro
    // n comparações para um vetor sem ordenação e n/2 comparações para um vetor ordenado
    int buscaSequencial(int[] vetor, int valorProcurado) {
        for (int i = 0; i < vetor.length && vetor[i - 1] < vetor[i]; i++) {
            if (vetor[i] == valorProcurado) {
                return i;
            }
        }
            return -1;
    }

    // Busca Sequencial Indexada
    // Utiliza uma tabela auxiliar, chamada índice, que armazena a posição onde um determinado elemento está contido na tabela geral

    // Busca binária
    // Busca em um vetor ordenado na qual se divide o vetor de dados em dois subvetores. Os objetos que ficam à esquerda do ponto de divisão devem ser menores que ele, e os que estão à direita, maiores. Uma solução ótima para esse algoritmo é definir o ponto de divisão baseado no ponto central do conjunto de dados
    // log n comparações
    int buscaBinaria(int[] vetor, int valorProcurado) {
        int inicio = 0;
        int fim = vetor.length - 1;

        // O fim começa com valor maior que o primeiro
        // O início pode aumentar (valor menor que o central) e o fim pode diminuir (valor maior que o central)
        // Se início se tornar igual ao fim, o laço é encerrado
        while (inicio < fim) {
            // Define o ponto de divisão
            int meio = (inicio + fim) / 2;

            // Se o elemento do meio for maior que o procurado, o procurado estará a esquerda dele e o meio acaba por se tornar o fim do vetor, desconsiderando os outros elementos
            if (vetor[meio] > valorProcurado)
                fim = meio - 1;

            // Se o elemento do meio for menor que o procurado, o procurado estará a direita dele e o meio acaba por se tornar o início do vetor, desconsiderando os outros elementos
            else if (vetor[meio] < valorProcurado)
                inicio = meio + 1;

            else
                return meio;
        }

        return -1;
    }
    
    public static void main(String[] args) {

    }
        
}