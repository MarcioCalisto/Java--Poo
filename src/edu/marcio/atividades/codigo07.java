package edu.marcio.atividades;

public class codigo07 {
    public static void main(String[] args) {
        int[] numeros = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3 };
        int contador = 0;
        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] == numeros[i + 1]) {
                contador++;
            }
        }
    }
}
