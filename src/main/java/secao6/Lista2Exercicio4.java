package secao6;

import java.util.Locale;
import java.util.Scanner;

public class Lista2Exercicio4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantas pares de números irá dividir: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            double resultado = 0;

            if (y != 0){
                resultado =(double) x / y;
                System.out.printf("%.1f%n", resultado);
            }else {
                System.out.println("Divisão Impossivel!");
            }
        }
        sc.close();
    }
}
