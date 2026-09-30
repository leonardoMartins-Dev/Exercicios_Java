import java.util.Scanner;
public class Fatorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int n = sc.nextInt();
        int fat = 1;
        for(int i=n; i>0; i--){
            fat *=i;
        }
        System.out.println("Fatorial de  "+ n + " é " + fat);
    }
}
