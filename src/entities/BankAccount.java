package entities;

public class BankAccount {

    public static final double TAX = 5.00;

    private int accountNumber;
    public String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public BankAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.00;
    } // 2 construtores - sobrecarga

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getAccountHolder() {
        return this.accountHolder;
    }

    // haverá possibilidade de alteração do titular pois o titular pode mudar de
    // nome, seja por ocasiao de casamento
    // ou outros.
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // cada saque realizado o banco cobra taxa de 5 reais.
    // conta pode ficar com saldo negativo se o saldo nao for suficiente.

    public void makeDeposit(double quantity) {
        this.balance += quantity;
    }

    public void makeWithdrawal(double quantity) {
        this.balance = (this.balance - quantity) - TAX;
    }

}
