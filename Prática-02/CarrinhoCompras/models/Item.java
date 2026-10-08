package models;

public class Item {
    private Produto produto;
    private int quantidade;
    private double valorTotal;

    public Item(Produto produto, int quantidade){
        this.produto=produto;
        this.quantidade=quantidade;
        calcularValorTotal();
    }

    //METODOS
    public void comprar(int quantidade){
        this.quantidade+=quantidade;
        calcularValorTotal();
    }
    public void calcularValorTotal(){
        valorTotal = produto.getPreco()*quantidade;
    }
    public void exibir(){
        System.out.println("Produto: "+ produto.getNome() +" (codigo "+ produto.getCodigo() +")");
        System.out.println("Preco unitario: R$ "+ String.format("%.2f", produto.getPreco()));
        System.out.println("Quantidade: "+ quantidade);
        System.out.println("Valor do item: R$ "+ String.format("%.2f", valorTotal));
    }



    //GETTERS SETTERS
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
        calcularValorTotal();
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        calcularValorTotal();
    }

    public double getValorTotal() {
        return valorTotal;
    }
}
