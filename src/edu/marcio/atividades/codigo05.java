package edu.marcio.atividades;

public class codigo05 {
    public static void main(String[] args) {
        int[][] matriz = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        int vResultado = 0;
        for (int i = 0; i < matriz.length; i++) {
            vResultado += matriz[i][i];
        }
        System.out.println("O resultado é: " + vResultado);
    }
}
