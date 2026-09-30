import java.util.Scanner;
public class Nprimo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int n = sc.nextInt();
        int contador = 0;
        int i = n;
        while(i>0){
            if(n%i==0){
                contador+=1;
            }
            i-=1;
        }

        if(contador==2){
            System.out.println("o numero é primo");
        }else if(contador>2){
            System.out.println("o numero nao é primo");
        }

    }
}
