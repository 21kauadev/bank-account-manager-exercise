package application;

import java.util.Scanner;

import entities.BankAccount;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String accountHolder = sc.nextLine();

        double balance = 0.00;

        System.out.print("Is there a initial deposit? (y/n) ");
        String hasDeposit = sc.nextLine();

        if (hasDeposit.charAt(0) == 'y') {
            System.out.print("Enter initial deposit value ");
            balance = sc.nextDouble();
            System.out.println();
        }

        BankAccount bankAccount = new BankAccount(accountNumber, accountHolder, balance);

        System.out.println("Account data: ");
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n", bankAccount.getAccountNumber(),
                bankAccount.getAccountHolder(), bankAccount.getBalance());

        System.out.println();

        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        bankAccount.makeDeposit(depositValue);

        System.out.println("Updated account data: ");
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n", bankAccount.getAccountNumber(),
                bankAccount.getAccountHolder(), bankAccount.getBalance());

        System.out.println();

        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        bankAccount.makeWithdrawal(withdrawValue);

        System.out.println("Updated account data: ");
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f", bankAccount.getAccountNumber(),
                bankAccount.getAccountHolder(), bankAccount.getBalance());

        sc.close();
    }
}
