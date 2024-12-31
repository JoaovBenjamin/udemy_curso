package aula35.exercicios;

import java.util.Scanner;

public class exe4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double x,y;

        System.out.println("digite o valor de x: ");
        x = sc.nextDouble();

        System.out.println("digite o valor de y: ");
        y = sc.nextDouble();
        
        if (x == 0 && y == 0){
            System.out.println("Origem");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (y < 0 && x > 0) {
            System.out.println("Q3");
        } else if (y == 0) {
            System.out.println("Eixo Y");
        } else if (x == 0) {
            System.out.println("Eixo y");
        } else {
            System.out.println("Q4");
        }

        sc.close();
    }
}
