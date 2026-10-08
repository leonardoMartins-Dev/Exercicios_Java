import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        String sobrenome;
        int idade;
        double altura;
        double peso;
        System.out.println("Digite o nome da pessoa: ");
        nome = sc.nextLine();
        System.out.println("Digite o sobrenome da pessoa: ");
        sobrenome = sc.nextLine();
        System.out.println("Digite a idade da pessoa: ");
        idade = sc.nextInt();
        System.out.println("Digite a altura da pessoa: ");
        altura = sc.nextDouble();
        System.out.println("Digite o peso da pessoa: ");
        peso = sc.nextDouble();

        pessoa p1 = new pessoa(nome, sobrenome, idade, altura, peso);
        
        p1.calcularIMC();
        p1.informarObesidade();
    }
}
