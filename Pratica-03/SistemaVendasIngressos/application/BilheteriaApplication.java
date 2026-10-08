package application;

import java.util.Scanner;

import models.Bilheteria;
import models.Ingresso;
import models.IngressoComum;
import models.IngressoEstudante;
import models.IngressoVIP;


public class BilheteriaApplication {
    static Scanner sc = new Scanner(System.in); 

    public static void main(String[] args) {
        int opcao;
        Bilheteria bilheteria = new Bilheteria();
        do {
            System.out.println();
            System.out.println("===== AGENDA =====");
            System.out.println("1 - Adicionar ingresso");
            System.out.println("2 - Remover ingresso ");
            System.out.println("3 - Buscar ingresso por codigo ");
            System.out.println("4 - Listar ingressos");
            System.out.println("5 - Calcular arrecadacao total ");
            System.out.println("6 - listar beneficios dos ingressos ");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    adicionarIngresso(bilheteria);
                    break;
                case 2:
                    removeIngresso(bilheteria);
                    break;
                case 3:
                    buscarIngresso(bilheteria);
                    break;
                case 4:
                    listarIngressos(bilheteria);
                    break;
                case 5:
                    calcularArrecadacao(bilheteria);
                    break;
                case 6:
                    listarBeneficiosTotais(bilheteria);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
        } while (opcao != 0);
    }

    //FUNCOES\
    static void adicionarIngresso(Bilheteria b){
        System.out.println("Qual tipo de ingresso vc quer criar?");
        System.out.println("1-Ingresso comum");
        System.out.println("2-Ingresso de estudante");
        System.out.println("3-Ingresso VIP");
        int op = sc.nextInt();
        sc.nextLine();
        switch (op) {
            case 1:{
                System.out.println("Digite o codigo do ingresso:");
                int codigo = sc.nextInt();
                sc.nextLine();
                System.out.println("Digite o nome do evento:");
                String nomeEvento = sc.nextLine();
                System.out.println("Digite o setor do ingresso:");
                String setor = sc.nextLine();
                System.out.println("Digite o valor base do ingresso:");
                Double valorBase = sc.nextDouble();
                sc.nextLine();
                IngressoComum ic = new IngressoComum(codigo, nomeEvento, setor, valorBase);
                b.addIngresso(ic);
                break;
            }
            case 2:{
                System.out.println("Digite o codigo do ingresso:");
                int codigo = sc.nextInt();
                sc.nextLine();
                System.out.println("Digite o nome do evento:");
                String nomeEvento = sc.nextLine();
                System.out.println("Digite o setor do ingresso:");
                String setor = sc.nextLine();
                System.out.println("Digite o valor base do ingresso:");
                Double valorBase = sc.nextDouble();
                sc.nextLine();
                System.out.println("Digite a instituicao de ensino do ingresso:");
                String instituicaoEnsino = sc.nextLine();
                IngressoEstudante ie = new IngressoEstudante(codigo, nomeEvento, setor, valorBase, instituicaoEnsino);
                b.addIngresso(ie);
                break;
            }
            case 3: {
                System.out.println("Digite o codigo do ingresso:");
                int codigo = sc.nextInt();
                sc.nextLine();
                System.out.println("Digite o nome do evento:");
                String nomeEvento = sc.nextLine();
                System.out.println("Digite o setor do ingresso:");
                String setor = sc.nextLine();
                System.out.println("Digite o valor base do ingresso:");
                Double valorBase = sc.nextDouble();
                sc.nextLine();
                System.out.println("O ingresso tem acesso ao Backstage? (true or false):");
                boolean acessoBackstage= sc.nextBoolean();
                System.out.println("Qual o numero do lounge do ingresso:");
                int numeroLounge = sc.nextInt();
                sc.nextLine();
                IngressoVIP ivip = new IngressoVIP(codigo, nomeEvento, setor, valorBase, acessoBackstage, numeroLounge);
                b.addIngresso(ivip);
                break;
            }
            default:
                System.out.println("Opcão inválida");
        }
    }
    static void removeIngresso(Bilheteria b){
        System.out.println("Qual codigo do ingresso que quer remover? ");
        int codigo = sc.nextInt();
        sc.nextLine();
        Ingresso i = b.buscarIngresso(codigo);
        b.removerIngresso(i);
    }
    static void buscarIngresso(Bilheteria b){
        System.out.println("Qual codigo do ingresso que quer remover? ");
        int codigo = sc.nextInt();
        sc.nextLine();
        Ingresso i = b.buscarIngresso(codigo);
        i.exibir();
    }
    static void listarIngressos(Bilheteria b){
        b.listarIngressos();
    }
    static void calcularArrecadacao(Bilheteria b){
        System.out.println("Arrecadacao: "+ b.calcularArrecadacaoTotal());
    }
    static void listarBeneficiosTotais(Bilheteria b){
        b.listarBeneficios();
    }
}