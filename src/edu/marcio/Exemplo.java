package edu.marcio;

public class Exemplo {

    private char vCaracter1 = 50;
    private char vCaracter2 = 60;
    private char vCaracter3 = 70;

    public void soma() {
        System.out.println(vCaracter1+""+vCaracter2+""+vCaracter3);
    }
    
    public static void main(String[] args) {
        Exemplo ex = new Exemplo();
        ex.soma();
    }
}
