package models;
public class IngressoEstudante extends Ingresso {
    private String instituicaoEnsino;

    public IngressoEstudante(int codigo, String nomeEvento, String setor, Double valorBase, String instituicaoEnsino){
        super(codigo, nomeEvento, setor, valorBase);
        this.instituicaoEnsino=instituicaoEnsino;
    }

    @Override
    public double calcularValorFinal(){
        return valorBase*0.5;
    }
    @Override 
    public String obterBeneficios(){
        return "Seu beneficio é a meia entrada";
    }
    @Override
    public void exibir() {
        // TODO Auto-generated method stub
        super.exibir();
        System.out.println("Instituicao de ensino: "+ instituicaoEnsino);
    }
}
