package aula26;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Entrada de dados
        // Scanner sc = new Scanner(System.in)

        //Para ler um dado tipo String deve se chamar a função next

        Scanner sc = new Scanner(System.in);
        String x;
        x = sc.next();

        System.out.println("Voce digitou: " + x);

        //Para ler um dado tipo int deve se chamar a função nextInt

        int x2;
        x2 = sc.nextInt();

        System.out.println("Voce digitou: " + x2);

        //Para ler um dado tipo double deve se chamar a função nextDouble

        double x3;
        x3  = sc.nextDouble();
        System.out.println("Voce digitou: " + x3);

        //Para ler um dado do tipo char utilza a função next.charAt(0);

        char x4;
        x4  = sc.next().charAt(0);
        System.out.println("Voce digitou: " + x4);
    }
}
