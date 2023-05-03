package secao6;

import java.util.Scanner;

public class Lista2Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro para calcular todos os seus divisores: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.println(i);
            }
        }
    }
}
