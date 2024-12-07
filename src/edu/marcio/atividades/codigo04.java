package edu.marcio.atividades;

public class codigo04 {
    public static void main(String[] args) {
        // Declaração e inicialização de uma matriz 3x3
        int[][] matriz = {
                { 1, 2, 3 }, // Primeira linha da matriz
                { 4, 5, 6 }, // Segunda linha da matriz
                { 7, 8, 9 }  // Terceira linha da matriz
        };

        // Percorre as linhas da matriz
        for (int i = 0; i < matriz.length; i++) {
            // Percorre as colunas da matriz na linha atual
            for (int j = 0; j < matriz[i].length; j++) {
                // Exibe o valor na posição [i][j] da matriz
                System.out.print(matriz[i][j] + " ");
            }
            // Quebra de linha após terminar de imprimir uma linha da matriz
            System.out.println();
        }
    }
}
