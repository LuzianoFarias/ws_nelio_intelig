package exercicioFixacao;

import java.util.Scanner;

public class ExercicioFixacao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dia;

        System.out.println("Digite um valor referente ao dia da semana: ");
        int x = sc.nextInt();

        switch (x){
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sabado";
                break;
            default:
                dia = "Valor invalido!";
        }

        System.out.println("Dia da semana: " + dia);

    }
}
