package exercicioFixacao;

import java.util.Scanner;

public class ExercicioFixacao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        System.out.println("Digite números inteiros para somar, quando desejar sair digite ( 0 ): ");
        int x = sc.nextInt();

        while (x != 0 ){
            soma = soma + x;
            x = sc.nextInt();
        }
        System.out.println(soma);
    }
}
