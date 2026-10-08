package ex05;

import java.util.Scanner;

public class PesquisaHabitantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int maiorIdade = 0;
        int menorIdade = 0;
        int mulheresFiltradas = 0;

        System.out.println("Digite os dados de cada habitante (idade -1 encerra).");

        while (true) {
            System.out.println();
            System.out.println("Habitante " + (total + 1));
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            if (idade == -1) {
                break;
            }

            System.out.print("Sexo (M/F): ");
            String sexo = sc.next();
            System.out.print("Cor dos olhos (azuis/verdes/castanhos): ");
            String olhos = sc.next();
            System.out.print("Cor dos cabelos (louros/castanhos/pretos): ");
            String cabelos = sc.next();

            if (total == 0 || idade > maiorIdade) {
                maiorIdade = idade;
            }
            if (total == 0 || idade < menorIdade) {
                menorIdade = idade;
            }

            boolean feminino = sexo.equalsIgnoreCase("F");
            boolean entre18e35 = idade >= 18 && idade <= 35;
            boolean olhosVerdes = olhos.equalsIgnoreCase("verdes");
            boolean cabelosLouros = cabelos.equalsIgnoreCase("louros");
            if (feminino && entre18e35 && olhosVerdes && cabelosLouros) {
                mulheresFiltradas++;
            }

            total++;
        }

        System.out.println();
        if (total == 0) {
            System.out.println("Nenhum habitante foi cadastrado.");
        } else {
            System.out.println("Maior idade: " + maiorIdade);
            System.out.println("Menor idade: " + menorIdade);
            System.out.println("Mulheres de 18 a 35 anos, olhos verdes e cabelos louros: " + mulheresFiltradas);
        }

        sc.close();
    }
}
