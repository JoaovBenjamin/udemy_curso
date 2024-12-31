package aula39;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite um dia da semana");
        int x = sc.nextInt();
        String dia;

        switch (x){
            case 1:
                dia = "domingo";
                System.out.println(dia);
                break;
            case 2:
                dia = "segunda";
                System.out.println(dia);
                break;
            case 3:
                dia = "terça";
                System.out.println(dia);
                break;
            case 4:
                dia = "quarta";
                System.out.println(dia);
                break;
            case 5:
                dia = "quinta";
                System.out.println(dia);
                break;
            case 6:
                dia = "sexta";
                System.out.println(dia);
                break;
            case 7:
                dia = "sábado";
                System.out.println(dia);
                break;
            default:
                System.out.println("Digite um numero de 1 a 7");
                break;
        }
        sc.close();
    }
}
