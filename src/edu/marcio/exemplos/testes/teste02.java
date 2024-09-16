package edu.marcio.exemplos.testes;

public class teste02 {
    public static void main(String[] args) {
        int variavel = 1234;
        System.out.println(variavel);
        System.out.println("Variavel");
        System.out.println("abc" + variavel);
        // System.out.println('variavel');

        boolean verdadeiro = true;
        boolean falso = false;
        if (!verdadeiro) {
            System.out.println("A variável é falsa");
        }
        if (!falso) {
            System.out.println("A variável é verdadeira");
        }
    }
}
