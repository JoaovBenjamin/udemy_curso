package aula24;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        // Configuração do local da sua aplicação
        Locale.setDefault(Locale.US);

        System.out.println("Hello world!");

        int y = 32;

        double x = 10.35784;

        System.out.println(x);
        System.out.println(y);

        // Formatação para demilitar a casa decimais

        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);

        //Concatenação

        System.out.println("Resultado da variavel é: " + x);

        System.out.printf("Resultado = %.2f%n", x);

        //Metodos para formatação e o tipo de dada:
        // %f = ponto flutuante (float)
        // %d = inteiro (double or int)
        // %s = texto (string)
        // %n = quebra de linha

        String nome = "João";
        int idade = 20;
        double renda = 4000.0;

        System.out.printf(
                "%s tem %d anos e ganha R$ %.2f reais%n",
                nome,
                idade,
                renda);


        //Exercicios


        //Achando um local onde o padrão de casa decimal é virgula
        Locale.setDefault(Locale.ITALY);

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5200;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf(
                "%s, which price is R$ %.2f %n",
                product1,
                price1);

        System.out.printf(
                "%s, which price is R$ %.2f %n",
                product2,
                price2
        );

        System.out.printf(
                "%d years old. code %d and gender: %s",
                age,
                code,
                gender
        );

        System.out.printf(
                "Measue with eight decimal places: %f",
                measure
        );

        System.out.printf(
                "Rounded (three decimal places): %.3f %n",
                measure);

        Locale.setDefault(Locale.US);

        System.out.printf("US decimal point: %.3f %n",
                measure);
    }
}