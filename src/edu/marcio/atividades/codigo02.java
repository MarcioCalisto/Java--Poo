package edu.marcio.atividades;

import java.util.Scanner;

public class codigo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro para o calculo: ");
        int n = scanner.nextInt();
        long resultado = calcular(n);
        System.out.println("O cálculo de " + n + " é: " + resultado);
        scanner.close();
    }

    public static long calcular(int n) {
        long retorno = 1;
        if (n == 0) {
            return retorno;
        }
        for (int i = 1; i <= n; i++) {
            retorno *= i;
        }
        return retorno;
    }
}
