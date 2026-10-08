package models;

public abstract class Contato {
    protected  String nome;
    protected  String email;
    protected  String telefone;


    public Contato(String nome, String email, String telefone){
        this.nome=nome;
        this.email=email;
        this.telefone=telefone;
    }

    public void exibir(){
        System.out.println("Nome: "+ nome);
        System.out.println("Email: "+ email);
        System.out.println("Telefone: "+ telefone);
    }



    //GETTERS SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


}
