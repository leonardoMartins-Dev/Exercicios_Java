package ex06;

import java.util.Scanner;

public class CorrecaoProvas {
    static final int QTD_ALUNOS = 10;
    static final int QTD_QUESTOES = 8;
    static final int NOTA_MINIMA = 6;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Gabarito ===");
        String[] gabarito = new String[QTD_QUESTOES];
        for (int q = 0; q < QTD_QUESTOES; q++) {
            System.out.print("Questão " + (q + 1) + ": ");
            gabarito[q] = sc.next();
        }

        int[] numeros = new int[QTD_ALUNOS];
        int[] notas = new int[QTD_ALUNOS];
        for (int a = 0; a < QTD_ALUNOS; a++) {
            System.out.println();
            System.out.print("Número do aluno " + (a + 1) + ": ");
            numeros[a] = sc.nextInt();
            for (int q = 0; q < QTD_QUESTOES; q++) {
                System.out.print("  Resposta da questão " + (q + 1) + ": ");
                String resposta = sc.next();
                if (resposta.equalsIgnoreCase(gabarito[q])) {
                    notas[a]++;
                }
            }
        }

        System.out.println();
        System.out.println("=== Resultado ===");
        int aprovados = 0;
        for (int a = 0; a < QTD_ALUNOS; a++) {
            System.out.println("Aluno " + numeros[a] + ": nota " + notas[a]);
            if (notas[a] >= NOTA_MINIMA) {
                aprovados++;
            }
        }

        double porcentagem = 100.0 * aprovados / QTD_ALUNOS;
        System.out.printf("Aprovação: %.1f%%%n", porcentagem);

        sc.close();
    }
}
