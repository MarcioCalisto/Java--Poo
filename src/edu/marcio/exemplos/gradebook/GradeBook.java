package edu.marcio.exemplos.gradebook;

import java.util.Scanner;

public class GradeBook {


    public void displayMessage() {
        System.out.println("Welcome to the Grade Book!");
    }

    public void displaySoma() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro number: ");
        int number1 = scanner.nextInt();

        System.out.println("Digite o segundo number: ");
        int number2 = scanner.nextInt();

        int soma = number1 + number2;
        System.out.println(soma);
    }
}
