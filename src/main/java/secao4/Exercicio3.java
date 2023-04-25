package secao4;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe 4 números inteiros:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int r = (a * b - c * d);

        System.out.printf("Diferenca = %d", r);

        sc.close();
    }


}
