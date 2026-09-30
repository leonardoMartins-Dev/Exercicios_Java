import java.util.Scanner;
public class area {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a altura: ");
        int altura = sc.nextInt();
        System.out.print("Digite a largura: ");
        int largura = sc.nextInt();

        int area = altura*largura;
        System.out.println(area);
    }
}
