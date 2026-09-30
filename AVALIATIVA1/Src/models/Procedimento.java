package Src.models;

public class Procedimento {
    private String nome;
    private float duracaoEstimada;
    private float valor;
    private String complexidade;

    public Procedimento(String nome, float duracaoEstimada, float valor,  String complexidade){
        this.nome=nome;
        this.duracaoEstimada=duracaoEstimada;
        this.valor=valor;
        this.complexidade=complexidade;
    }

    public void exibir(){
        System.out.println("Procedimento: " + nome + " | Duracao: " + duracaoEstimada + " min | Valor: R$ " + valor + " | Complexidade: " + complexidade);
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getDuracaoEstimada() {
        return duracaoEstimada;
    }
    public void setDuracaoEstimada(float duracaoEstimada) {
        this.duracaoEstimada = duracaoEstimada;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public String getComplexidade() {
        return complexidade;
    }
    public void setComplexidade(String complexidade) {
        this.complexidade = complexidade;
    }

}
