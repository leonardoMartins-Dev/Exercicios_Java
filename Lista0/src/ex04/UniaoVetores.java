package ex04;

import java.util.Scanner;

public class UniaoVetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tamanho do vetor X (n): ");
        int n = sc.nextInt();
        System.out.print("Tamanho do vetor Y (m): ");
        int m = sc.nextInt();

        int[] x = lerVetor(sc, "X", n);
        int[] y = lerVetor(sc, "Y", m);

        // Percorre X e depois Y, adicionando em Z só o que ainda não está lá
        int[] z = new int[n + m];
        int tamanhoZ = 0;
        for (int i = 0; i < n + m; i++) {
            int valor = (i < n) ? x[i] : y[i - n];
            if (!contem(z, tamanhoZ, valor)) {
                z[tamanhoZ] = valor;
                tamanhoZ++;
            }
        }

        System.out.println();
        System.out.print("Z = [");
        for (int i = 0; i < tamanhoZ; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(z[i]);
        }
        System.out.println("]");

        sc.close();
    }

    private static int[] lerVetor(Scanner sc, String nome, int tamanho) {
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            System.out.print(nome + "[" + i + "]: ");
            vetor[i] = sc.nextInt();
        }
        return vetor;
    }

    private static boolean contem(int[] vetor, int tamanho, int valor) {
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == valor) {
                return true;
            }
        }
        return false;
    }
}
