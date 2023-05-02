package secao6;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua senha: ");
        int senha = sc.nextInt();

        while (senha != 2002){
            System.out.println("Senha incorreta!");
            senha = sc.nextInt();
        }
        sc.close();
        System.out.println("Acesso Permitido!");
    }
}
