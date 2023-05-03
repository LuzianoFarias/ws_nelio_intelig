package secao6;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("Digite o número referente ao tipo de combustive desejado: ");
        System.out.println("1 - Alcool \n2 - Gasolina \n3 - Diesel");
        System.out.println("OPS:");
        int tipo = sc.nextInt();

        while (tipo != 4){
            if (tipo == 1){
                alcool = alcool + 1;
            } else if (tipo == 2) {
                gasolina = gasolina + 1;
            }else if (tipo == 3){
                diesel = diesel + 1;
            }
            tipo = sc.nextInt();
        }
        System.out.println("Muito obrigado!");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
