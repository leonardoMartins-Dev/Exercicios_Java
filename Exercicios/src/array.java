import java.util.ArrayList;
import java.util.Scanner;
public class array {
    public static void main(String[] args){
        ArrayList<Integer> lista = new ArrayList<>();
        System.out.println("Digite o tamanho da lista: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            lista.add(i);
        }
        System.out.println("O tamanho da lista é: "+ lista.toArray().length);
        for(int i=0; i<n; i++){
            System.out.println(lista.get(i));
        }
    }
}
