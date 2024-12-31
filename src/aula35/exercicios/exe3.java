package aula35.exercicios;

import java.util.Scanner;

public class exe3 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        //Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
        //Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
        //ordem crescente ou decrescente.

        System.out.println("Digite o primeiro numero: ");
        int a = sc.nextInt();

        System.out.println("Digite o segundo numero");
        int b = sc.nextInt();

        if(a % b == 0 || b % a == 0){
            System.out.println("São multiplos");
        }else {
            System.out.println("Não são multiplos");
        }

        sc.close();

    }
}
