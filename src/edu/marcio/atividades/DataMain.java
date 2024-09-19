package edu.marcio.atividades;

public class DataMain {
    public static void main(String[] args) {

        Data myData = new Data(15, 2, 2024);
        System.out.println("Data original: ");
        myData.mostrarData();

        myData.adicionarUmDia();
        System.out.println("Data após adicionar 1 dia: ");
        myData.mostrarData();
    }
}
