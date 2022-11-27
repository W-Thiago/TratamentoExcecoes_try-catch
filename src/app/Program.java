package app;

import entities.Account;
import exceptions.BusinessException;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter account data ");
        System.out.print("Number: ");
        Integer number = sc.nextInt();
        System.out.print("Holder: ");
        sc.nextLine();
        String Holder  = sc.nextLine();
        System.out.print("Initial balance: ");
        double initialBalance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double WithdrawLimit = sc.nextDouble();

        Account account = new Account(number,Holder,initialBalance,WithdrawLimit);

        System.out.println();
        System.out.print("Enter amount for withdraw: ");
        double balanceW = sc.nextDouble();
        System.out.println();


        try {
            account.withdraw(balanceW); // aqui chamou o metodo saque da class Account
            System.out.printf("new balance %.2f%n" , account.getBalance());
        }
        catch (BusinessException e) {
            System.out.println(e.getMessage());
        }

        sc.close();


    }
}
