package edu.marcio.exemplos.ContaBancaria;

public class Account {

    private double Balance; // Váriavel de instância que armazena o salário

    // Construtor
    public Account(double initialBalance) {
        // Valida que initialBalance é maior que 0,0;
        // Se não o salário é inicializado com o valor padrão 0,0;
        if (initialBalance > 0.0) {
            Balance = initialBalance;
        } // Fim do construtor

        // Credita (adiciona) uma quantia à conta
    }

    public void credit(double amount) {
        Balance = Balance + amount; // Adiciona quantia ao saldo
        System.out.println(Balance);
    } // Fim do método credit

    // Retorna saldo da conta
    public double getBalance() {
        return Balance; // Fornece o valor de saldo ao método chamado
    } // Fim do método
} // Fim da classe Account
