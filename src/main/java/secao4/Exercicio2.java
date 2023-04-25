package secao4;

import java.util.Locale;
import java.util.Scanner;


public class Exercicio2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;

        System.out.println("Informe o raio de um circulo:");
        double raio = sc.nextDouble() ;

        double area = pi * raio * raio;

        System.out.printf("A = %.4f", area);

        sc.close();
    }

}
