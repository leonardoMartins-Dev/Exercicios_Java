package application;

import java.util.Scanner;
import models.*;

public class AgendaApplication {
    static Scanner sc = new Scanner(System.in); 

    public static void main(String[] args) {
        int opcao;
        Agenda agenda = new Agenda();
        do {
            System.out.println();
            System.out.println("===== AGENDA =====");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Remover contato ");
            System.out.println("3 - Buscar contato por nome ");
            System.out.println("4 - Buscar contato por email ");
            System.out.println("5 - Buscar contato por telefone ");
            System.out.println("6 - Consultar tamanho da Agenda ");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    addContato(agenda);
                    break;
                case 2:
                    removerContato(agenda);
                    break;
                case 3:
                    buscarPorNome(agenda);
                    break;
                case 4:
                    buscarPorEmail(agenda);
                    break;
                case 5:
                    buscarPorTelefone(agenda);
                    break;
                case 6:
                    consultarTamanho(agenda);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
        } while (opcao != 0);
    }

    //FUNCOES
    static void addContato(Agenda ag){
        System.out.println("Qual tipo de contato vc quer criar?");
        System.out.println("1-Contato Emergencial");
        System.out.println("2-Contato Pessoal");
        System.out.println("3-Contato Profissional");
        int op = sc.nextInt();
        sc.nextLine();
        switch (op) {
            case 1:{
                System.out.println("Digite o nome do contato:");
                String nome = sc.nextLine();
                System.out.println("Digite o email do contato:");
                String email = sc.nextLine();
                System.out.println("Digite o telefone do contato:");
                String telefone = sc.nextLine();
                System.out.println("Digite o grau de prioridade do contato:");
                int grau = sc.nextInt();
                sc.nextLine();
                System.out.println("Digite a observacao do contato:");
                String obs = sc.nextLine();
                ContatoEmergencia ce = new ContatoEmergencia(nome, email, telefone, grau, obs);
                ag.addContato(ce);
                break;
            }
            case 2:{
                System.out.println("Digite o nome do contato:");
                String nome = sc.nextLine();
                System.out.println("Digite o email do contato:");
                String email = sc.nextLine();
                System.out.println("Digite o telefone do contato:");
                String telefone = sc.nextLine();
                System.out.println("Digite data de aniversário do contato:");
                String data = sc.nextLine();
                System.out.println("Digite o parentesco do contato:");
                String parentesco = sc.nextLine();
                ContatoPessoal cp = new ContatoPessoal(nome, email,telefone, data, parentesco);
                ag.addContato(cp);
                break;
            }
            case 3:{
                System.out.println("Digite o nome do contato:");
                String nome = sc.nextLine();
                System.out.println("Digite o email do contato:");
                String email = sc.nextLine();
                System.out.println("Digite o telefone do contato:");
                String telefone = sc.nextLine();
                System.out.println("Digite a empresa do contato:");
                String empresa = sc.nextLine();
                System.out.println("Digite o cargo do contato:");
                String cargo = sc.nextLine();
                ContatoProfissional cpr = new ContatoProfissional(nome, email, telefone, empresa, cargo);
                break;
            }
            default:
                System.out.println("Opcao invalida.");
        }
    }
    static void removerContato(Agenda ag){
        System.out.println("Qual o nome do contato que vc quer remover? ");
        String nome = sc.nextLine();
        Contato c= ag.buscarContatoNome(nome);
        ag.removerContato(c);
    }
    static void buscarPorNome(Agenda ag){
        System.out.println("Qual o nome do contato que vc quer buscar? ");
        String nome = sc.nextLine();
        Contato c= ag.buscarContatoNome(nome);
        c.exibir();
    }
    static void buscarPorEmail(Agenda ag){
        System.out.println("Qual o email do contato que vc quer buscar? ");
        String email = sc.nextLine();
        Contato c= ag.buscarContatoNome(email);
        c.exibir();
    }
    static void buscarPorTelefone(Agenda ag){
        System.out.println("Qual o telefone do contato que vc quer buscar? ");
        String telefone = sc.nextLine();
        Contato c= ag.buscarContatoNome(telefone);
        c.exibir();
    }
    static void consultarTamanho(Agenda ag){
        int tamanho=ag.tamanhoAgenda();
        System.out.println("O tamanho da agenda é: "+ tamanho);
    }
}
