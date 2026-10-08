package ex08;

import java.util.Scanner;

public class LojaArtesanato {
    static final int QTD_OBJETOS = 10;
    static final double SALARIO_FIXO = 545.00;
    static final double TAXA_COMISSAO = 0.05;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] precos = new double[QTD_OBJETOS];
        int[] quantidades = new int[QTD_OBJETOS];

        for (int i = 0; i < QTD_OBJETOS; i++) {
            System.out.println("Objeto " + (i + 1));
            System.out.print("  Preço unitário: R$ ");
            precos[i] = sc.nextDouble();
            System.out.print("  Quantidade vendida: ");
            quantidades[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("=== Relatório de vendas ===");
        System.out.printf("%-8s %6s %14s %14s%n", "Objeto", "Qtd", "Unitário", "Total");

        double totalGeral = 0;
        int maisVendido = 0;
        for (int i = 0; i < QTD_OBJETOS; i++) {
            double totalObjeto = precos[i] * quantidades[i];
            totalGeral += totalObjeto;
            System.out.printf("%-8d %6d %14.2f %14.2f%n", i + 1, quantidades[i], precos[i], totalObjeto);

            if (quantidades[i] > quantidades[maisVendido]) {
                maisVendido = i;
            }
        }

        double comissao = totalGeral * TAXA_COMISSAO;
        System.out.println();
        System.out.printf("Total geral das vendas: R$ %.2f%n", totalGeral);
        System.out.printf("Comissão do vendedor (5%%): R$ %.2f%n", comissao);
        System.out.printf("Salário do mês (fixo + comissão): R$ %.2f%n", SALARIO_FIXO + comissao);
        System.out.printf("Objeto mais vendido: posição %d do vetor, valor unitário R$ %.2f%n",
                maisVendido, precos[maisVendido]);

        sc.close();
    }
}
