package application;

import java.util.Scanner;

import models.Fatura;
import models.Item;
import models.Produto;

public class CarrinhoApplication {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Produto[] produtos = {
            new Produto(1, "Caneta", 2.50),
            new Produto(2, "Caderno", 18.90),
            new Produto(3, "Lapis", 1.75),
            new Produto(4, "Borracha", 3.00),
            new Produto(5, "Resma de papel A4", 29.90)
        };
        Fatura fatura = new Fatura();
        boolean finalizado = false;
        do {
            System.out.println();
            System.out.println("===== LOJA DE SUPRIMENTOS =====");
            System.out.println("1 - Comprar");
            System.out.println("2 - Ver fatura");
            System.out.println("3 - Excluir item");
            System.out.println("4 - Alterar item");
            System.out.println("5 - Finalizar");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    comprar(produtos, fatura);
                    break;
                case 2:
                    verFatura(fatura);
                    break;
                case 3:
                    excluirItem(fatura);
                    break;
                case 4:
                    alterarItem(fatura);
                    break;
                case 5:
                    finalizado = finalizar(fatura);
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
        } while (!finalizado);
    }

    //FUNCOES
    static Produto buscarProduto(Produto[] produtos, int codigo){
        for(Produto p : produtos){
            if(p.getCodigo() == codigo){
                return p;
            }
        }
        return null;
    }
    static void comprar(Produto[] produtos, Fatura f){
        System.out.println("===== PRODUTOS =====");
        for(Produto p : produtos){
            p.exibir();
        }
        System.out.println("Digite o codigo do produto desejado (0 para voltar):");
        int codigo = sc.nextInt();
        sc.nextLine();
        if(codigo == 0){
            return;
        }
        Produto p = buscarProduto(produtos, codigo);
        if(p == null){
            System.out.println("Produto nao encontrado.");
            return;
        }
        System.out.println("Digite a quantidade (0 para voltar):");
        int quantidade = sc.nextInt();
        sc.nextLine();
        if(quantidade == 0){
            return;
        }
        if(quantidade < 0){
            System.out.println("Quantidade invalida.");
            return;
        }
        f.incluirItem(p, quantidade);
        System.out.println("Produto adicionado a fatura!");
    }
    static void verFatura(Fatura f){
        f.exibir();
        System.out.println("Pressione ENTER para voltar");
        sc.nextLine();
    }
    static void excluirItem(Fatura f){
        if(f.estaVazia()){
            System.out.println("A fatura esta vazia.");
            return;
        }
        f.exibir();
        System.out.println("Digite o codigo do produto do item que quer excluir (0 para voltar):");
        int codigo = sc.nextInt();
        sc.nextLine();
        if(codigo == 0){
            return;
        }
        Item i = f.buscarItem(codigo);
        if(i == null){
            System.out.println("Item nao encontrado na fatura.");
            return;
        }
        f.removerItem(i);
        System.out.println("Item removido!");
    }
    static void alterarItem(Fatura f){
        if(f.estaVazia()){
            System.out.println("A fatura esta vazia.");
            return;
        }
        f.exibir();
        System.out.println("Digite o codigo do produto do item que quer alterar (0 para voltar):");
        int codigo = sc.nextInt();
        sc.nextLine();
        if(codigo == 0){
            return;
        }
        Item i = f.buscarItem(codigo);
        if(i == null){
            System.out.println("Item nao encontrado na fatura.");
            return;
        }
        System.out.println("Digite a nova quantidade (0 para voltar):");
        int quantidade = sc.nextInt();
        sc.nextLine();
        if(quantidade == 0){
            return;
        }
        if(quantidade < 0){
            System.out.println("Quantidade invalida.");
            return;
        }
        f.alterarQuantidadeItem(i, quantidade);
        System.out.println("Quantidade alterada!");
    }
    static boolean finalizar(Fatura f){
        System.out.println("Deseja finalizar a compra?");
        System.out.println("1 - Sim");
        System.out.println("0 - Voltar");
        int op = sc.nextInt();
        sc.nextLine();
        if(op != 1){
            return false;
        }
        f.exibir();
        System.out.println("Valor final da compra: R$ "+ String.format("%.2f", f.getValorTotal()));
        System.out.println("Obrigado pela compra!");
        return true;
    }
}
