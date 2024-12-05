package edu.marcio.atividades;

import java.util.Scanner;

public class JurosSimples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o valor principal (R$): ");
        double principal = scanner.nextDouble();
        System.out.print("Digite a taxa de juros (em %): ");
        double taxaJuros = scanner.nextDouble();
        System.out.print("Digite o tempo (em anos): ");
        double tempo = scanner.nextDouble();

        // Cálculo dos juros simples
        double juros = (principal * taxaJuros * tempo) / 100;
        double montante = principal + juros;

        // Saída dos resultados
        System.out.println("\n--- Resultado ---");
        System.out.printf("Juros simples: R$%.2f\n", juros);
        System.out.printf("Montante total (Principal + Juros): R$%.2f\n", montante);

        scanner.close();
    }
}