import java.util.ArrayList;
import java.util.Scanner;
//MAIN

public class Loja {
    public static void main(String[] args) {

        //CRIANDO PRODUTOS
        produto Suco = new produto("Suco", 5.50f, 10);
        produto Sanduiche = new produto("Sanduiche", 7.50f, 10);

        //CRIANDO COMPRA
        compra c1 = new compra(1, Suco);
        c1.adicionar_produto(Sanduiche);
        c1.exibir();
        c1.fechar_compra();
    }
}

//CLASSE PRODUTO
class produto {
    private String nome;
    private float preco;
    private Integer estoque;

    public produto(String nome, float preco, Integer estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public void exibir() {
        System.out.println("Produto: " + nome + " - Preco: " + preco);
    }

    public float getPreco(){
        return preco;
    }
}

//CLASSE COMPRA
class compra {
    private Integer id;
    private ArrayList<produto> produtos;

    public compra(Integer id, produto produto) {
        this.id = id;
        this.produtos = new ArrayList<>();
        produtos.add(produto);
    }

    public void adicionar_produto(produto produto) {
        produtos.add(produto);
    }

    public void exibir() {
        System.out.println("Compra: " + id);
        System.out.println("Itens: ");
        for (produto p : produtos) {
            if (p != null) {
                p.exibir();
            }
        }
    }

    public void fechar_compra() {
        exibir();
        float total = 0;
        for (produto p : produtos) {
            if (p != null) {
                total += p.getPreco();
            }
        }
        System.out.println("Total: " + total);
        System.out.println("Escolha a forma de pagamento: ");
        System.out.println("1-Crédito");
        System.out.println("2-Débito");
        System.out.println("3-Pix");

        Scanner sc = new Scanner(System.in);
        Integer formaPgmto = sc.nextInt();

        if (formaPgmto == 1 || formaPgmto == 2) {
            System.out.println("Aproxime ou insira seu cartão");
            validarPagamento();
        } else if (formaPgmto == 3) {
            System.out.println("Leia o Qr code: ");
            validarPagamento();
        } else {
            System.out.println("Forma de pagamento inválida.");
        }
    }

    private void validarPagamento() {
        System.out.print("Validando forma de pagamento");
        try {
            for (int i = 0; i < 3; i++) {
                Thread.sleep(500); // espera 0.5s
                System.out.print(".");
            }
            System.out.println("\nPagamento aprovado!");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("\nValidação interrompida.");
        }
    }
}