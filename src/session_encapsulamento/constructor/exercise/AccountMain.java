package session_encapsulamento.constructor.exercise;

import java.awt.*;
import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.println("Qual é o numero da conta: ");
        int number = sc.nextInt();
        System.out.println("Digite o nome da conta: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Vai querer fazer um deposito inicial ? (y/n)");
        char response = sc.next().charAt(0);
        if(response == 'y'){
            System.out.println("Digite o valor do deposito: ");
            double deposity = sc.nextDouble();
            account = new Account(number, name, deposity);
        }else {
            account = new Account(number,name);
        }

        System.out.println(account);

        System.out.println("Quanto deseja depositar: ");
        double deposity = sc.nextDouble();
        account.deposity(deposity);

        System.out.println(account);

        System.out.println("Quanto deseja sacar: ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);

        System.out.println(account);
    }
}
