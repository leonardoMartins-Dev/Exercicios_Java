package models;

import java.util.ArrayList;

public class Bilheteria {
    private ArrayList<Ingresso> listaIngressos;

    public Bilheteria(){
        listaIngressos = new ArrayList<>();
    }


    public void addIngresso(Ingresso i){
        listaIngressos.add(i);
    }
    public void removerIngresso(Ingresso i){
        listaIngressos.remove(i);
    }
    public Ingresso buscarIngresso(int codigo){
        for(Ingresso i : listaIngressos){
            if(i.getCodigo() == codigo){
                return i;
            }
        }
        return null;
    }
    public void listarIngressos(){
        for(Ingresso i : listaIngressos){
            i.exibir();
        }
    }
    public double calcularArrecadacaoTotal(){
        double total = 0;
        for(Ingresso i : listaIngressos){
            total+=i.calcularValorFinal();
        }
        return total;
    }
    public void listarBeneficios(){
        for(Ingresso i : listaIngressos){
            System.out.println(i.obterBeneficios());
        }
    }




    //GETTERS SETTERS
    public ArrayList<Ingresso> getListaIngressos() {
        return listaIngressos;
    }

    public void setListaIngressos(ArrayList<Ingresso> listaIngressos) {
        this.listaIngressos = listaIngressos;
    }  
}
