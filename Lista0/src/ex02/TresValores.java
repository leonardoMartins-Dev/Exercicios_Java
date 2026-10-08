package ex02;

import java.util.Scanner;

public class TresValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] valores = new int[3];
        String[] nomes = {"x", "y", "z"};
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Digite " + nomes[i] + ": ");
            valores[i] = sc.nextInt();
        }
        int x = valores[0];
        int y = valores[1];
        int z = valores[2];

        int maior = valores[0];
        int menor = valores[0];
        for (int i = 1; i < valores.length; i++) {
            if (valores[i] > maior) {
                maior = valores[i];
            }
            if (valores[i] < menor) {
                menor = valores[i];
            }
        }

        System.out.println();
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

        String intervalo = "[" + y + ", " + z + "]";
        if (x >= y && x <= z) {
            System.out.println(x + " está dentro do intervalo " + intervalo);
        } else {
            System.out.println(x + " está fora do intervalo " + intervalo);
        }

        testaDivisivel(x, y);
        testaDivisivel(x, z);

        sc.close();
    }

    private static void testaDivisivel(int x, int divisor) {
        if (divisor == 0) {
            System.out.println("Não dá para dividir " + x + " por zero");
        } else if (x % divisor == 0) {
            System.out.println(x + " é divisível por " + divisor);
        } else {
            System.out.println(x + " não é divisível por " + divisor);
        }
    }
}
