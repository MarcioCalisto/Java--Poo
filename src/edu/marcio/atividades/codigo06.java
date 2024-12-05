package edu.marcio.atividades;

public class codigo06 {
    public static void main(String[] args) {
        int[] numeros = { 2, 5, 8, 1, 9 };
        int vProcurado = 8;
        boolean encontrado = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == vProcurado) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("O valor " + vProcurado + " foi encontrado.");
        } else {
            System.out.println("O valor " + vProcurado + " não foi encontrado.");
        }
    }
}
