package secao4;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quant1, quant2, cod1, cod2;
        double valor1, valor2, soma;

            System.out.println("Informe o código da peça: ");
            cod1 = sc.nextInt();

            System.out.println("Informe quantidade de peças: ");
            quant1 = sc.nextInt();

            System.out.println("Informe o valor unitário de cada peça: ");
            valor1 = sc.nextDouble();

            System.out.println("Informe o código da peça: ");
            cod2 = sc.nextInt();

            System.out.println("Informe quantidade de peças: ");
            quant2 = sc.nextInt();

            System.out.println("Informe o valor unitário de cada peça: ");
            valor2 = sc.nextDouble();

            soma = quant1 * valor1 + quant2 * valor2;

        System.out.printf("Valor a pagar: R$ %.2f",soma);

        sc.close();

    }
}
