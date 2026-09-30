package Src.application;

import java.util.ArrayList;
import java.util.Scanner;

import Src.models.Atendimento;
import Src.models.Procedimento;
import Src.models.Sala;
import Src.models.Veterinario;



public class ClinicaApplication {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Veterinario> veterinarios = new ArrayList<>();
    static ArrayList<Sala> salas = new ArrayList<>();
    static ArrayList<Atendimento> atendimentos = new ArrayList<>();

    public static void main(String[] args) {
        criarDadosIniciais();
        int opcao;
        do {
            System.out.println();
            System.out.println("===== CLINICA VETERINARIA =====");
            System.out.println("1 - Cadastrar atendimento");
            System.out.println("2 - Associar veterinario a uma sala");
            System.out.println("3 - Atribuir atendimento a uma sala");
            System.out.println("4 - Exibir atendimentos de uma sala");
            System.out.println("5 - Total de atendimentos finalizados por sala");
            System.out.println("6 - Buscar atendimentos por status");
            System.out.println("7 - Exibir detalhes de um atendimento");
            System.out.println("8 - Finalizar atendimento");
            System.out.println("0 - Sair");
            opcao = lerInt("Opcao: ");

            switch (opcao) {
                case 1:
                    cadastrarAtendimento();
                    break;
                case 2:
                    associarVeterinario();
                    break;
                case 3:
                    atribuirAtendimento();
                    break;
                case 4:
                    exibirAtendimentosDaSala();
                    break;
                case 5:
                    exibirFinalizadosPorSala();
                    break;
                case 6:
                    buscarPorStatus();
                    break;
                case 7:
                    exibirAtendimento();
                    break;
                case 8:
                    finalizarAtendimento();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
        } while (opcao != 0);
    }

    static void criarDadosIniciais() {
        veterinarios.add(new Veterinario("leo", "13318833690", "cardiologista", "31987451563"));
        veterinarios.add(new Veterinario("joao", "12338443690", "cardiologista", "31987333563"));
        veterinarios.add(new Veterinario("Pedro", "13158453690", "Geral", "31981749563"));

        salas.add(new Sala(1, 'a', 10, "grave"));
        salas.add(new Sala(2, 'b', 10, "medio"));
        salas.add(new Sala(3, 'c', 10, "suave"));
    }

    static void cadastrarAtendimento() {
        String codigo = lerTexto("Codigo: ");
        if (buscarAtendimento(codigo) != null) {
            System.out.println("Ja existe um atendimento com esse codigo.");
            return;
        }
        String nomeAnimal = lerTexto("Nome do animal: ");
        String especie = lerTexto("Especie: ");
        String nomeTutor = lerTexto("Nome do tutor: ");
        String data = lerTexto("Data (dd/mm/aaaa): ");
        String horario = lerTexto("Horario (hh:mm): ");
        String obs = lerTexto("Observacoes: ");

        System.out.println("-- Procedimento --");
        String nomeProcedimento = lerTexto("Nome do procedimento: ");
        float duracao = lerFloat("Duracao estimada (min): ");
        float valor = lerFloat("Valor: ");
        String complexidade = lerTexto("Nivel de complexidade (baixa/media/alta): ");

        Procedimento procedimento = new Procedimento(nomeProcedimento, duracao, valor, complexidade);
        Atendimento atendimento = new Atendimento(codigo, nomeAnimal, especie, nomeTutor, data, horario, obs, procedimento);
        atendimentos.add(atendimento);
        System.out.println("Atendimento cadastrado com status agendado.");
    }

    static void associarVeterinario() {
        for (Veterinario veterinario : veterinarios) {
            veterinario.exibir();
        }
        Veterinario veterinario = buscarVeterinario(lerTexto("CPF do veterinario: "));
        if (veterinario == null) {
            System.out.println("Veterinario nao encontrado.");
            return;
        }
        Sala sala = escolherSala();
        if (sala == null) {
            return;
        }
        if (sala.atribuirVeterinario(veterinario)) {
            System.out.println("Veterinario associado a sala " + sala.getNumero() + ".");
        } else {
            System.out.println("Este veterinario ja e responsavel por uma sala.");
        }
    }

    static void atribuirAtendimento() {
        Atendimento atendimento = escolherAtendimento();
        if (atendimento == null) {
            return;
        }
        Sala sala = escolherSala();
        if (sala == null) {
            return;
        }
        if (sala.addAtendimento(atendimento)) {
            System.out.println("Atendimento atribuido a sala " + sala.getNumero() + ". Status: em andamento.");
        } else {
            System.out.println("Nao foi possivel atribuir. Verifique se o atendimento esta agendado, se a sala tem veterinario, se tem vaga e se recebe o mesmo procedimento.");
        }
    }

    static void exibirAtendimentosDaSala() {
        Sala sala = escolherSala();
        if (sala != null) {
            sala.exibirAtendimentos();
            sala.exibirQtdAtendimentos();
        }
    }

    static void exibirFinalizadosPorSala() {
        for (Sala sala : salas) {
            int total = 0;
            for (Atendimento atendimento : atendimentos) {
                if (atendimento.getStatus().equals("finalizado") && atendimento.getSala() == sala) {
                    total++;
                }
            }
            System.out.println("Sala " + sala.getNumero() + ": " + total + " atendimento(s) finalizado(s)");
        }
    }

    static void buscarPorStatus() {
        System.out.println("1 - agendado | 2 - em andamento | 3 - finalizado");
        int opcao = lerInt("Status: ");
        String status;
        if (opcao == 1) {
            status = "agendado";
        } else if (opcao == 2) {
            status = "em andamento";
        } else if (opcao == 3) {
            status = "finalizado";
        } else {
            System.out.println("Status invalido.");
            return;
        }

        boolean encontrou = false;
        for (Atendimento atendimento : atendimentos) {
            if (atendimento.getStatus().equals(status)) {
                atendimento.exibir();
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum atendimento com status " + status + ".");
        }
    }

    static void exibirAtendimento() {
        Atendimento atendimento = escolherAtendimento();
        if (atendimento != null) {
            atendimento.exibir();
        }
    }

    static void finalizarAtendimento() {
        Atendimento atendimento = escolherAtendimento();
        if (atendimento == null) {
            return;
        }
        if (atendimento.finalizar()) {
            System.out.println("Atendimento finalizado.");
        } else {
            System.out.println("Somente atendimentos em andamento podem ser finalizados.");
        }
    }

    static Veterinario buscarVeterinario(String cpf) {
        for (Veterinario veterinario : veterinarios) {
            if (veterinario.getCpf().equals(cpf)) {
                return veterinario;
            }
        }
        return null;
    }

    static Sala buscarSala(int numero) {
        for (Sala sala : salas) {
            if (sala.getNumero() == numero) {
                return sala;
            }
        }
        return null;
    }

    static Atendimento buscarAtendimento(String codigo) {
        for (Atendimento atendimento : atendimentos) {
            if (atendimento.getCodigo().equals(codigo)) {
                return atendimento;
            }
        }
        return null;
    }

    static Sala escolherSala() {
        for (Sala sala : salas) {
            sala.exibir();
        }
        Sala sala = buscarSala(lerInt("Numero da sala: "));
        if (sala == null) {
            System.out.println("Sala nao encontrada.");
        }
        return sala;
    }

    static Atendimento escolherAtendimento() {
        Atendimento atendimento = buscarAtendimento(lerTexto("Codigo do atendimento: "));
        if (atendimento == null) {
            System.out.println("Atendimento nao encontrado.");
        }
        return atendimento;
    }

    static String lerTexto(String mensagem) {
        System.out.print(mensagem);
        return sc.nextLine();
    }

    static int lerInt(String mensagem) {
        return Integer.parseInt(lerTexto(mensagem).trim());
    }

    static float lerFloat(String mensagem) {
        return Float.parseFloat(lerTexto(mensagem).trim().replace(",", "."));
    }
}
