import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        String nome;
        int idade;
        double altura;
        boolean ativo = true;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.print("Digite sua idade: ");
        idade = sc.nextInt();

        if (idade>=18) {
            System.out.println("Vc é maior de idade");
        }else{
            System.out.println("Vc é menor de idade");
        }
    }
}