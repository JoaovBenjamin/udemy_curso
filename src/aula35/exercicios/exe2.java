package aula35.exercicios;

import java.util.Scanner;

public class exe2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("Par");
        }else {
            System.out.println("Impar");
        }
        sc.close();

    }
}
