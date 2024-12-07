package edu.marcio.atividades;

public class codigo05 {
    public static void main(String[] args) {
        // Declaração e inicialização de uma matriz 3x3
        int[][] matriz = {
                { 1, 2, 3 }, // Primeira linha
                { 4, 5, 6 }, // Segunda linha
                { 7, 8, 9 }  // Terceira linha
        };

        int vResultado = 0; // Variável para armazenar a soma dos elementos da diagonal principal

        // Percorre as linhas da matriz
        for (int i = 0; i < matriz.length; i++) {
            // Soma os elementos da diagonal principal (posição [i][i])
            vResultado += matriz[i][i];
        }

        // Exibe o resultado da soma
        System.out.println("O resultado é: " + vResultado);
    }
}
