package secao6;

import java.util.Scanner;

public class Lista2Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para que sejá mostrado os impares entre o intervalo do número:" );
        int x = sc.nextInt();

        for (int i = 1; i <= x ; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
