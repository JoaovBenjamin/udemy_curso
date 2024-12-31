package aula35.exercicios;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Exercicio 1
        // Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

        System.out.println("Digite um número: ");
        double num = sc.nextInt();

        if(num < 0){
            System.out.println("É negativo");
        }else {
            System.out.println("É positivo");
        }
        sc.close();
    }
}
