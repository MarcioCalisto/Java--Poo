package edu.marcio.atividades;

public class BubbleSortExample {
    public static void main(String[] args) {
        // Declaração e inicialização de um array de números do tipo double
        double[] array = { 1.8, 7, 9, 2, 3 };

        // Exibição do array antes da ordenação
        System.out.println("Array antes ....");
        for (double num : array) {
            System.out.print(num + " ");
        }

        // Chama o método bubbleSort para ordenar o array
        bubbleSort(array);

        // Exibição do array após a ordenação
        System.out.println("\n\nArray após ....");
        for (double num : array) {
            System.out.print(num + " ");
        }
    }

    /**
     * Método que implementa o algoritmo Bubble Sort para ordenar um array.
     *
     * O algoritmo Bubble Sort compara pares de elementos adjacentes no array
     * e os troca de lugar se estiverem fora de ordem. O processo é repetido
     * até que o array esteja completamente ordenado.
     *
     * @param array O array de números do tipo double a ser ordenado
     */
    public static void bubbleSort(double[] array) {
        int n = array.length; // Tamanho do array
        boolean vTrocou; // Variável de controle para verificar se houve troca

        // Laço externo: realiza n-1 passagens pelo array
        for (int i = 0; i < n - 1; i++) {
            vTrocou = false; // Inicializa a variável como false para cada passagem

            // Laço interno: percorre os elementos ainda não ordenados
            for (int j = 0; j < n - i - 1; j++) {
                // Compara dois elementos adjacentes
                if (array[j] > array[j + 1]) {
                    // Se estiverem fora de ordem, realiza a troca
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    // Marca que houve troca nesta passagem
                    vTrocou = true;
                }
            }

            // Se nenhuma troca foi realizada, o array já está ordenado
            if (!vTrocou) {
                break;
            }
        }
    }
}
