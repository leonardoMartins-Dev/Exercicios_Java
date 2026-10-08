package ex01;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int x = sc.nextInt();

        if (x < 0) {
            System.out.println("Não existe fatorial de número negativo.");
        } else {
            // long aguenta até 20!; int estoura a partir de 13!
            long fatorial = 1;
            for (int i = x; i > 1; i--) {
                fatorial *= i;
            }
            System.out.println(x + "! = " + fatorial);
        }

        sc.close();
    }
}
