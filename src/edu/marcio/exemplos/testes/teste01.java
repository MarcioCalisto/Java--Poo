package edu.marcio.exemplos.testes;

import java.util.Locale;
import java.util.Scanner;

public class teste01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Enter firts number: ");
        int number1 = scanner.nextInt();

        System.out.println("Enter second number: ");
        int number2 = scanner.nextInt();

        int sum = number1 + number2;

        System.out.printf("Sum is %d\n", sum);
    }
}
