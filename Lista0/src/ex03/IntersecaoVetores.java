package ex03;

import java.util.Scanner;

public class IntersecaoVetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de alunos (n): ");
        int n = sc.nextInt();

        System.out.println("Matrículas de Programação Modular:");
        int[] modular = lerVetor(sc, n);
        System.out.println("Matrículas de Cálculo:");
        int[] calculo = lerVetor(sc, n);

        System.out.println();
        System.out.println("Alunos matriculados nas duas disciplinas:");
        boolean achou = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (modular[i] == calculo[j]) {
                    System.out.println(modular[i]);
                    achou = true;
                    break;
                }
            }
        }
        if (!achou) {
            System.out.println("Nenhum.");
        }

        sc.close();
    }

    private static int[] lerVetor(Scanner sc, int tamanho) {
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            System.out.print("  Matrícula " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }
        return vetor;
    }
}
