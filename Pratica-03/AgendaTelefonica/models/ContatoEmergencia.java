package models;

public class ContatoEmergencia extends Contato {
    private int grauPrioridade;
    private String observacao;

    public ContatoEmergencia(String nome, String email, String telefone, int grau, String obs){
        super(nome, email, telefone);
        this.grauPrioridade=grau;
        this.observacao=obs;
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("Grau de prioridade: "+ grauPrioridade);
        System.out.println("Observacao: "+ observacao);
    }



    //GETTERS & SETTERS
    public int getGrauPrioridade() {
        return grauPrioridade;
    }
    public void setGrauPrioridade(int grauPrioridade) {
        this.grauPrioridade = grauPrioridade;
    }
    public String getObservacao() {
        return observacao;
    }
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
}
