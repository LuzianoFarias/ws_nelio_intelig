package secao5;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a hora inicial e a hora final do jogo: ");
        int horaIni = sc.nextInt();
        int horaFinal = sc.nextInt();

        int duracao;
        if (horaIni < horaFinal){
             duracao = horaFinal - horaIni;
        }else {
             duracao = 24 - horaIni + horaFinal;

        }
        System.out.println("O jogo durou " + duracao + " hora(s)");

        sc.close();
    }

}
