import java.util.Scanner;
public class classeCarro {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do carro: ");
        String Nome = sc.nextLine();
        System.out.println("Digite a posicao do carro: ");
        int Posicao = sc.nextInt();
        sc.nextLine();
        carro A1 = new carro(Nome, Posicao);
        A1.exibir();
        A1.andar();
        A1.exibir();
        System.out.println("Quer andar mais? (y ou n)");
        String escolha = sc.nextLine();
        if (escolha.equals("y")) {
            A1.andar();
            A1.exibir();
        }
    }
}

class carro{
    private String nome;
    private int posicao;
    public carro(String nome, int posicao){
        this.nome = nome;
        this.posicao = posicao;
    }
    public void andar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos Km vc quer andar? ");
        int andar = sc.nextInt();
        this.posicao = this.posicao+andar;
    }
    public void exibir(){
        System.out.println("Nome: "+ this.nome + "\n"+
                            "Posicao: "+ this.posicao);
    }

}
