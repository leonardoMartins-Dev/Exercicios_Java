import java.util.Scanner;

public class mediaNotas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite nota1: ");
        int nota1 = sc.nextInt();
        System.out.print("Digite nota2: ");
        int nota2 = sc.nextInt();
        System.out.print("Digite nota3: ");
        int nota3 = sc.nextInt();
        int Soma = nota1+nota2+nota3;
        int media = Soma/3;
        System.out.println("Media: "+ media);
    }
}


