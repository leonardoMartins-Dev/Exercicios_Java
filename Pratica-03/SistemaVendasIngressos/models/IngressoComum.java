package models;
public class IngressoComum extends Ingresso {
    public IngressoComum(int codigo, String nomeEvento, String setor, Double valorBase){
        super(codigo, nomeEvento, setor, valorBase);
    }


    @Override
    public double calcularValorFinal(){
        return valorBase;
    }
    @Override 
    public String obterBeneficios(){
        return "Seu ingresso não possui beneficios";
    }
    @Override
    public void exibir() {
        // TODO Auto-generated method stub
        super.exibir();
    }
}
