package secao4;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe sua matricula, números de horas trabalhadas e valor recebido por hora: ");
        int matricula = sc.nextInt();
        int horatrab = sc.nextInt();
        double recebhora = sc.nextDouble();

        double salario = horatrab * recebhora;


        System.out.printf("Number %d %n", matricula);
        System.out.printf("Salary = U$ %.2f", salario);

        sc.close();
    }
}
