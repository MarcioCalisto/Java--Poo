// Pacote da aplicação
package edu.marcio.atividades;

// Importação da classe Arrays para manipulação e exibição de arrays
import java.util.Arrays;

// Classe principal do programa
public class codigo01 {

    // Método principal (ponto de entrada do programa)
    public static void main(String[] args) {

        // Declaração e inicialização de um array de inteiros
        int[] numeros = { 5, 2, 9, 1, 5, 6 };

        // Exibe o array inicial no console
        System.out.println("Vetor inicial: " + Arrays.toString(numeros));

        // Chama o método Executar para ordenar o array
        Executar(numeros);

        // Exibe o array final (após ordenação) no console
        System.out.println("Vetor final: " + Arrays.toString(numeros));
    }

    /**
     * Método responsável por ordenar o array em ordem decrescente.
     * Utiliza o algoritmo de ordenação Bubble Sort.
     *
     * @param arr Array de inteiros a ser ordenado.
     */
    public static void Executar(int[] arr) {

        int n = arr.length; // Determina o tamanho do array

        // Laço externo: controla o número de passagens
        for (int i = 0; i < n - 1; i++) {

            // Laço interno: compara pares de elementos adjacentes
            for (int j = 0; j < n - 1; j++) {

                // Verifica se o elemento atual é menor que o próximo
                if (arr[j] < arr[j + 1]) {

                    // Troca os elementos de posição
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
