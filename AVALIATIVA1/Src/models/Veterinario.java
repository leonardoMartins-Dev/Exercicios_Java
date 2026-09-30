package Src.models;


public class Veterinario{
    private String nome;
    private String cpf;
    private String especialidade;
    private String telefone;
    private Sala sala;

    public Veterinario(String nome, String cpf, String especialidade, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.especialidade = especialidade;
        this.telefone = telefone;
    }

    public void atribuirSala(Sala sala){
        this.sala = sala;
    }

    public void exibir(){
        System.out.println("Veterinario: " + nome + " | CPF: " + cpf + " | Especialidade: " + especialidade + " | Telefone: " + telefone);
    }




    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public Sala getSala() {
        return sala;
    }



}
