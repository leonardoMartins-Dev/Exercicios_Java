package models;
import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> listaContatos;
    private int quantidadeContatos;
    //CONSTRUTOR
    public Agenda(){
        listaContatos = new ArrayList<>();
    }
    //METODOS
    public void addContato(Contato c){
        listaContatos.add(c);
        quantidadeContatos+=1;
    }
    public void removerContato(Contato c){
        try {
            listaContatos.remove(c);
            quantidadeContatos-=1;
        } catch (Exception e) {
            System.out.println("O contato não encontrado");
        }
        
    }
    public Contato buscarContatoNome(String nome){
        for(Contato c : listaContatos){
            if(c.getNome().toUpperCase().equals(nome.toUpperCase())){
                return c;
            }
        }
        return null;
    }
    public Contato buscarContatoEmail(String email){
        for(Contato c : listaContatos){
            if(c.getEmail().toUpperCase().equals(email.toUpperCase())){
                return c;
            }
        }
        return null;
    }
    public Contato busContatoTelefone(String telefone){
        for(Contato c : listaContatos){
            if(c.getTelefone().equals(telefone)){
                return c;
            }
        }
        return null;
    }
    public int tamanhoAgenda(){
        quantidadeContatos = listaContatos.size();
        return quantidadeContatos;
    }

    //GETTERS & SETTERS
    public ArrayList<Contato> getListaContatos() {
        return listaContatos;
    }
    public void setListaContatos(ArrayList<Contato> listaContatos) {
        this.listaContatos = listaContatos;
    }
    public int getQuantidadeContatos() {
        return quantidadeContatos;
    }
    public void setQuantidadeContatos(int quantidadeContatos) {
        this.quantidadeContatos = quantidadeContatos;
    }
    
}
