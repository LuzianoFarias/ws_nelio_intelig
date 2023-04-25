package secao4;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe dois números inteiros:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int soma = num1 + num2;

        System.out.printf("Soma = %d", soma);
        sc.close();
    }
}
