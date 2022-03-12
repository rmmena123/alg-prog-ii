import java.util.Scanner;
import java.math.BigInteger;
import java.util.Arrays;
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

    // ----------------------------------------------------------------------------------------------------------

    // Busca Sequencial Indexada
    // Utiliza uma tabela auxiliar, chamada índice, que armazena a posição onde um determinado elemento está contido na tabela geral

    // ----------------------------------------------------------------------------------------------------------

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

    // ----------------------------------------------------------------------------------------------------------

    // Recursividade
    // Sempre que o método recursivo encontrar um caso básico do problema, ele consegue retornar um resultado definitivo. Como consequência, os demais casos, os casos recursivos, obtêm sua resolução. Assim, toda vez que um problema complexo é apresentado, este deve ser dividido em pequenos subproblemas, mais simples, para que o problema original seja resolvido.
    // O passo recursivo geralmente possui uma instrução do tipo return, cuja execução se encerra retornando o valor do resultado do processamento, o que torna possível a combinação entre os subproblemas ao obter o resultado do caso básico

    // Cálculo Fatorial
    public static int fatorial(int n) {
        if(n <= 1) {
            return 1; // caso básico
        } 

        return n * fatorial(n - 1); // passo recursivo
    }

    // função recursiva
    public static BigInteger fatorial(BigInteger n) {
        if(n.compareTo(BigInteger.ONE) <= 0) {
            return BigInteger.ONE;
        } // caso básico
        
        // Passo recursivo
        return n.multiply(fatorial(n.subtract(BigInteger.ONE)));
    }

    // Cálculo Fibonacci
    // Constante de apoio
    private static final BigInteger TWO = BigInteger.valueOf(2);

    // Declaracao do método de fibonacci recursivo
    public static BigInteger fibonacci(BigInteger n) {
        // Casos básicos
        if (n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE)) {
        return n;
        }

        // Chamada recursiva de Fibonacci - fibonacci(n - 1) + fibonacci(n - 2)
        return fibonacci(n.subtract(BigInteger.ONE)).add(fibonacci(n.subtract(TWO)));
    }
    
    // Recursão linear - Possui apenas uma chamada recursiva em sua execução
    public static int somatorio(int[] v, int n) {
        // Caso básico
        if (n == 1) return v[0];
        // Passo recursivo
        return somatorio(v, --n) + v[n];
    }

    // Método auxilar para troca de posição
    public static void troca(int[] v, int posA, int posB) {
        int aux = v[posA];
        v[posA] = v[posB];
        v[posB] = aux;
    }

    public static void inverter(int[] v, int inicio, int fim) {
        if(inicio >= fim) return; //caso básico

        troca(v, inicio, fim);

        inverter(v, ++inicio, --fim); //passo recursivo
    }

    // Recursão Binária - Duas chamadas recursivas dentro de si - Fibonacci
    // Recursão Múltipla - Múltiplas chanadas recursivas dentro de si

    public static void main(String[] args) {
        int[] v = {1, 3, 5, 7, 9, 11, 13};

        // cálculo do fatorial de 0 a 5
        for(int n = 0; n <= 5; n++)
            System.out.printf("%d! => %d\n", n, fatorial(n));

        for(int n = 0; n <= 5; n++)
            System.out.printf("%d! => %d\n", n, fatorial(BigInteger.valueOf(n)));

        for(int i = 0; i <= 10; i++)
            System.out.printf("Fibonacci(%d) => %d\n", i, fibonacci(BigInteger.valueOf(i)));
            
        System.out.printf("O valor do somatório é %d\n", somatorio(v, v.length));

        inverter(v, 0, v.length - 1);
        System.out.println(Arrays.toString(v));
    }
        
}