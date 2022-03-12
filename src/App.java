import java.util.Scanner;

public class App {
    // Percorre o vetor do primeiro ao último valor, sequencialmente, em busca do elemento passado por parâmetro
    int buscaSequencial(int[] vetor, int valorProcurado) {
        for (int i = 0; i < vetor.length && vetor[i - 1] < vetor[i]; i++) {
            if (vetor[i] == valorProcurado) {
                return i;
            }
        }
            return -1;
    }
    
    public static void main(String[] args) {

    }
        
}