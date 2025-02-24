package POO.aula01;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        double xA, xB, xC, yA, yB, yC;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the messures of triangle X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        System.out.println("Enter the messures of triangle y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC)/2;
        double area = Math.sqrt(p*(p - xA) * (p - xB) *  (p - xC));

        double pY = (yA + yB + yC)/2;
        double areaY = Math.sqrt(pY*(pY - yA) * (pY - yB) *  (pY - yC));

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
