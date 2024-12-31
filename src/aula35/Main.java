package aula35;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x = 5;

        System.out.println("Boa tarde");


        // Estrutura condicional simples
        // Se a condição for verdadeira roda o bloco de comando,
        // Se for falsa pula o bloco de comando

        if (x < 0){
            System.out.println("Bom dia");
        }
        System.out.println("Boa noite");

        //Estrutura condicional composta
        //Se for verdadeira roda o bloco de cima
        //Se for falsa roda o bloco de baixo
        if ( x< 0){
            System.out.println("Boa tarde");
        }else {
            System.out.println("Não esta de tarde");
        }

        // Estrura condicional encadeadas
        // Exucuta a função em três ou mais blocos
        // Onde ele procura a condicial e realiza o bloco que é verdadeiro
        int hora;
        Scanner sc = new Scanner(System.in);
        System.out.println("Que horas são");
        hora = sc.nextInt();
        
        if(hora < 12){
            System.out.println("Bom dia");
        } else if (hora < 18) {
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }

        sc.close();
    }
}
