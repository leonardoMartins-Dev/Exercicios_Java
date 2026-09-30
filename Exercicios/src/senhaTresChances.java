import java.util.Scanner;
public class senhaTresChances {
    public static void main(String[] args){
        int senha=123;
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int tentativa;
        do{
            System.out.println("Digite a senha: ");
            tentativa = sc.nextInt();
            n--;
        }while(tentativa != senha && n>0);

    }
}
