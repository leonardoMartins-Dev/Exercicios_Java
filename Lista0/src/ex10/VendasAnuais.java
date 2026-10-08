package ex10;

import java.util.Scanner;

public class VendasAnuais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] meses = {"janeiro", "fevereiro", "março", "abril", "maio", "junho",
                "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        int semanas = 4;
        double[][] vendas = new double[meses.length][semanas];

        for (int m = 0; m < meses.length; m++) {
            System.out.println("Vendas de " + meses[m] + ":");
            for (int s = 0; s < semanas; s++) {
                System.out.print("  Semana " + (s + 1) + ": R$ ");
                vendas[m][s] = sc.nextDouble();
            }
        }

        double[] totalPorSemana = new double[semanas];
        double totalAno = 0;

        System.out.println();
        System.out.println("=== Total por mês ===");
        for (int m = 0; m < meses.length; m++) {
            double totalMes = 0;
            for (int s = 0; s < semanas; s++) {
                totalMes += vendas[m][s];
                totalPorSemana[s] += vendas[m][s];
            }
            totalAno += totalMes;
            System.out.printf("%-10s R$ %.2f%n", meses[m], totalMes);
        }

        System.out.println();
        System.out.println("=== Total por semana (ano todo) ===");
        for (int s = 0; s < semanas; s++) {
            System.out.printf("Semana %d: R$ %.2f%n", s + 1, totalPorSemana[s]);
        }

        System.out.println();
        System.out.printf("Total vendido no ano: R$ %.2f%n", totalAno);

        sc.close();
    }
}
