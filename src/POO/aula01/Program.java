package POO.aula01;

import POO.aula01.entity.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Triangle x,y;
        x = new Triangle();
        y = new Triangle();

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the messures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the messures of triangle y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double p = (x.a + x.b + x.c)/2;
        double area = Math.sqrt(p*(p - x.a) * (p - x.b) *  (p - x.c));

        double pY = (y.a + y.b + y.c)/2;
        double areaY = Math.sqrt(pY*(pY - y.a) * (pY - y.b) *  (pY - y.c));

        System.out.printf("Triangle X area: %.4f%n", area);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if(area > areaY){
            System.out.println("Larger area: X");
        }else {
            System.out.println("Larger area: Y");
        }

        sc.close();
    }
}
