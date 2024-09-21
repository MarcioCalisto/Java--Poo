package edu.marcio.exemplos.ContaBancaria;

import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {

        Scanner Ler = new Scanner(System.in);

        Account minhaConta = new Account(2300);

        // Exibe o saldo inicial de cada objeto
        System.out.printf("o saldo da sua conta é: $%.2f \n",
                minhaConta.getBalance());

        // Cria Scanner para obter entrada a partir da janela
        double depositeQuantia;

        System.out.println("Insira a quantia na sua conta: ");
        depositeQuantia = Ler.nextDouble();

        System.out.printf("\n Valor adicionado na sua conta: %.2f\n\n",
                depositeQuantia);

        minhaConta.credit(depositeQuantia); // Adiciona o saldo

        System.out.printf("Saldo da sua conta: $%.2f \n",
                minhaConta.getBalance());
    }
}
