package edu.marcio.atividades;

import java.util.Scanner;

public class codigo02 {
    public static void main(String[] args) {
        // Criação de um objeto Scanner para entrada de dados pelo usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que digite um número inteiro
        System.out.print("Digite um número inteiro para o cálculo: ");
        int n = scanner.nextInt(); // Lê o número digitado pelo usuário
        
        // Chama o método calcular para realizar o cálculo com o número fornecido
        long resultado = calcular(n);
        
        // Exibe o resultado do cálculo
        System.out.println("O cálculo de " + n + " é: " + resultado);
        
        // Fecha o objeto Scanner para liberar recursos
        scanner.close();
    }

    /**
     * Método para calcular o fatorial de um número inteiro não negativo.
     * O fatorial de um número n é definido como o produto de todos os inteiros positivos
     * de 1 até n (n!), e o fatorial de 0 é definido como 1.
     *
     * @param n Número inteiro fornecido para o cálculo do fatorial
     * @return O fatorial de n (n!)
     */
    public static long calcular(int n) {
        long retorno = 1; // Inicializa o resultado como 1
        
        // Caso especial: o fatorial de 0 é 1
        if (n == 0) {
            return retorno;
        }
        
        // Laço para calcular o fatorial: multiplica retorno por cada número de 1 a n
        for (int i = 1; i <= n; i++) {
            retorno *= i; // Atualiza o resultado
        }
        
        return retorno; // Retorna o resultado final
    }
}
