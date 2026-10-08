package ex07;

import java.util.Scanner;

public class Temperaturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] meses = {"janeiro", "fevereiro", "março", "abril", "maio", "junho",
                "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        double[] temperaturas = new double[meses.length];

        for (int i = 0; i < meses.length; i++) {
            System.out.print("Temperatura média de " + meses[i] + ": ");
            temperaturas[i] = sc.nextDouble();
        }

        int maior = 0;
        int menor = 0;
        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] > temperaturas[maior]) {
                maior = i;
            }
            if (temperaturas[i] < temperaturas[menor]) {
                menor = i;
            }
        }

        System.out.println();
        System.out.printf("Maior temperatura: %.1f °C em %d - %s%n", temperaturas[maior], maior + 1, meses[maior]);
        System.out.printf("Menor temperatura: %.1f °C em %d - %s%n", temperaturas[menor], menor + 1, meses[menor]);

        sc.close();
    }
}
