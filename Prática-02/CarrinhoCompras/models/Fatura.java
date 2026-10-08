package models;

import java.util.ArrayList;

public class Fatura {
    private ArrayList<Item> listaItens;
    private double valorTotal;

    public Fatura(){
        listaItens = new ArrayList<>();
        valorTotal = 0;
    }

    //METODOS
    public void incluirItem(Produto p, int quantidade){
        //se o produto ja esta na fatura, so aumenta a quantidade do item
        Item item = buscarItem(p.getCodigo());
        if(item != null){
            item.comprar(quantidade);
        } else {
            listaItens.add(new Item(p, quantidade));
        }
        calcularValorTotal();
    }
    public void removerItem(Item i){
        listaItens.remove(i);
        calcularValorTotal();
    }
    public void alterarQuantidadeItem(Item i, int quantidade){
        i.setQuantidade(quantidade);
        calcularValorTotal();
    }
    public Item buscarItem(int codigoProduto){
        for(Item i : listaItens){
            if(i.getProduto().getCodigo() == codigoProduto){
                return i;
            }
        }
        return null;
    }
    public void calcularValorTotal(){
        valorTotal = 0;
        for(Item i : listaItens){
            valorTotal+=i.getValorTotal();
        }
    }
    public int quantidadeItens(){
        return listaItens.size();
    }
    public boolean estaVazia(){
        return listaItens.size() == 0;
    }
    public void exibir(){
        System.out.println("===== FATURA =====");
        if(estaVazia()){
            System.out.println("Nenhum item na fatura.");
        }
        for(Item i : listaItens){
            i.exibir();
            System.out.println("------------------");
        }
        System.out.println("Quantidade de itens: "+ quantidadeItens());
        System.out.println("Valor total da fatura: R$ "+ String.format("%.2f", valorTotal));
    }



    //GETTERS SETTERS
    public ArrayList<Item> getListaItens() {
        return listaItens;
    }

    public void setListaItens(ArrayList<Item> listaItens) {
        this.listaItens = listaItens;
        calcularValorTotal();
    }

    public double getValorTotal() {
        return valorTotal;
    }
}
