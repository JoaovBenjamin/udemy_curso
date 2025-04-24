package StaticMembers;

import java.util.Locale;
import java.util.Scanner;

public class DolarConverter {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a cotação do dolar: ");
        double cota = sc.nextDouble();

        System.out.println("Digite quantos dolar vc quer comprar");
        double qtdDolar = sc.nextDouble();

        double valorEmReal = CurrencyConverter.calcConverter(cota, qtdDolar);

        System.out.printf("Valor total é: %.2f%n", valorEmReal);
        sc.close();
    }
}
