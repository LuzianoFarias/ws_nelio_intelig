package secao4;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo, pi = 3.14159;

        System.out.println("Informe o valor de A: ");
        A = sc.nextDouble();
        System.out.println("Informe o valor de B: ");
        B = sc.nextDouble();
        System.out.println("Informe o valor de C: ");
        C = sc.nextDouble();

        triangulo = A * C / 2.0;
        circulo = pi * C * C;
        trapezio = (A + B) / 2.0 * C;
        quadrado = B * B;
        retangulo = A * B;

        System.out.printf("Triangulo: %.3f%n", triangulo);
        System.out.printf("Circulo: %.3f%n", circulo);
        System.out.printf("Trapezio: %.3f%n", trapezio);
        System.out.printf("Quadrado: %.3f%n", quadrado);
        System.out.printf("Retangulo: %.3f%n", retangulo);

        sc.close();
    }
}
