import java.time.LocalDate;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;

        //LISTA ALUNOS
        Aluno [] alunosLista = new Aluno[10];

        //INSERIR ALUNOS
        while (x < 10) {

            String nome;
            String sobrenome;
            LocalDate dataNascimento;
            int coragem;
            int inteligencia;
            int ambicao;
            int lealdade;
            int estrategia;
            int criatividade;

            System.out.println("Digite o nome do aluno");
            nome = sc.nextLine();

            System.out.println("Digite o sobrenome do aluno");
            sobrenome = sc.nextLine();

            System.out.println("Digite a data de nascimento do aluno (DD,MM,AAAA)");
            int dia = sc.nextInt();
            int mes = sc.nextInt();
            int ano = sc.nextInt();
            sc.nextLine();
            dataNascimento = LocalDate.of(ano, mes, dia);

            System.out.println("Digite a coragem do aluno (0-10)");
            coragem = sc.nextInt();

            System.out.println("Digite a inteligencia do aluno (0-10)");
            inteligencia = sc.nextInt();

            System.out.println("Digite a ambicao do aluno (0-10)");
            ambicao = sc.nextInt();

            System.out.println("Digite a lealdade do aluno (0-10)");
            lealdade = sc.nextInt();

            System.out.println("Digite a estrategia do aluno (0-10)");
            estrategia = sc.nextInt();

            System.out.println("Digite a criatividade do aluno (0-10)");
            criatividade = sc.nextInt();

            Aluno a = new Aluno(x + 1, nome, sobrenome, dataNascimento, coragem, inteligencia, ambicao, lealdade, estrategia, criatividade);
            a.calcularIdade();
            alunosLista[x] = a;
            a.calcularCasa();
            a.gerarMatricula();
            a.exibirInfos();

            x++;

            System.out.println("Quer verificar a casa de mais um aluno? (1-Sim 2-Nao)");
            int y_n = sc.nextInt();
            sc.nextLine();
            if (y_n == 2){
                break;
            }
        }

        //EXIBIR ALUNOS
        System.out.println("TODOS ALUNOS: ");
        for(int i = 0; i < alunosLista.length; i++){
            if (alunosLista[i] != null) {
                alunosLista[i].exibirInfos();
            }
        }

        //EXIBIR ALUNO POR CASA
        System.out.println("ALUNOS POR CASA: ");
        Aluno [] alunoGrifinoria = new Aluno[10];
        Aluno [] alunoSonserina = new Aluno[10];
        Aluno [] alunoCorvinal = new Aluno[10];
        Aluno [] alunoLufaLufa = new Aluno[10];
        for (int i = 0; i < alunosLista.length; i++){
            if (alunosLista[i] == null) {
                continue;
            }
            if (alunosLista[i].formatarCasa().equals("GRIFINORIA")){
                alunoGrifinoria[i] = alunosLista[i];
            }
            if (alunosLista[i].formatarCasa().equals("SONSERINA")){
                alunoSonserina[i] = alunosLista[i];
            }
            if (alunosLista[i].formatarCasa().equals("CORVINAL")){
                alunoCorvinal[i] = alunosLista[i];
            }
            if (alunosLista[i].formatarCasa().equals("LUFALUFA")){
                alunoLufaLufa[i] = alunosLista[i];
            }
        }
        System.out.println("GRIFINORIA: ");
        for (int j = 0; j < alunoGrifinoria.length; j++){
            if (alunoGrifinoria[j] != null){
                alunoGrifinoria[j].exibirInfos();
            }
        }
        System.out.println("SONSERINA: ");
        for (int j = 0; j < alunoSonserina.length; j++){
            if (alunoSonserina[j] != null){
                alunoSonserina[j].exibirInfos();
            }
        }
        System.out.println("CORVINAL: ");
        for (int j = 0; j < alunoCorvinal.length; j++){
            if (alunoCorvinal[j] != null){
                alunoCorvinal[j].exibirInfos();
            }
        }
        System.out.println("LUFALUFA: ");
        for (int j = 0; j < alunoLufaLufa.length; j++){
            if (alunoLufaLufa[j] != null){
                alunoLufaLufa[j].exibirInfos();
            }
        }

        //EXIBIR ALUNO MAIORES DE IDADE
        System.out.println("ALUNOS MAIORES DE IDADE: ");
        for (int i = 0; i < alunosLista.length; i++){
            if (alunosLista[i] != null && alunosLista[i].getIdade() >= 18){
                alunosLista[i].exibirInfos();
            }
        }
        //EXIBIR ALUNO MENORES DE IDADE
        System.out.println("ALUNOS MENORES DE IDADE: ");
        for (int i = 0; i < alunosLista.length; i++){
            if (alunosLista[i] != null && alunosLista[i].getIdade() < 18){
                alunosLista[i].exibirInfos();
            }
        }
        //BUSCAR ALUNO PELO SOBRENOME
        System.out.println("Digite o Sobrenome do aluno a ser procurado: ");
        String busca = sc.nextLine();
        for (int i = 0; i < alunosLista.length; i++){
            if (alunosLista[i] != null && alunosLista[i].getSobrenome().equals(busca)){
                alunosLista[i].exibirInfos();
            }
        }
    }
}