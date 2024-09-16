package edu.marcio.exemplos.testes;

import java.util.Locale;
import java.util.Scanner;

public class teste03 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Enter first interger: ");
        int number1 = scanner.nextInt();

        System.out.println("Enter second interger: ");
        int number2 = scanner.nextInt();

        if (number1 == number2) {
            System.out.printf("%d == %d\n", number1, number2);
        }
        if (number1 != number2) {
            System.out.printf("%d != d%\n", number1, number2);
        }
        if (number1 < number2) {
            System.out.printf("%d > d%\n", number1, number2);
        }
        if (number1 < number2) {
            System.out.printf("%d < %d\n", number1, number2);
        }
        if (number1 >= number2) {
            System.out.printf("%d >= %d\n", number1, number2);
        }
        if (number1 <= number2) {
            System.out.printf("%d <= %d\n", number1, number2);
        }
    }
}
