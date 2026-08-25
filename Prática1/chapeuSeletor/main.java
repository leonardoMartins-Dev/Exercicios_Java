import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String nome;
            int idade;
            int coragem;
            int inteligencia;
            int ambicao;
            int lealdade;
            int estrategia;
            int criatividade;
            System.out.println("Digite o nome do aluno");
            nome = sc.nextLine();
            System.out.println("Digite a idade do aluno");
            idade = sc.nextInt();
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

            Aluno a = new Aluno(nome, idade, coragem, inteligencia, ambicao, lealdade, estrategia, criatividade);

            a.calcularCasa();
            a.exibirInfos();

            System.out.println("Quer verificar a casa de mais um aluno? (1-Sim 2-Nao)");
            int y_n = sc.nextInt();
            if (y_n == 2){
                break;
            }
        }
    }
}
