package models;
public class IngressoVIP extends Ingresso{
    private boolean acessoBackstage;
    private int numeroLounge;

    public IngressoVIP(int codigo, String nomeEvento, String setor, Double valorBase, boolean acessoBackstage, int numeroLounge){
        super(codigo, nomeEvento, setor, valorBase);
        this.acessoBackstage=acessoBackstage;
        this.numeroLounge=numeroLounge;
    }


    @Override
    public double calcularValorFinal(){
        return valorBase*1.8;
    }
    @Override 
    public String obterBeneficios(){
        if(acessoBackstage){
            return "Seu beneficio é acesso ao backstage e Lounge ";
        }
        return "Seu beneficio é acesso ao Lounge";
    }
    @Override
    public void exibir() {
        // TODO Auto-generated method stub
        super.exibir();
        System.out.println("Acesso ao Backstage: "+ acessoBackstage);
        System.out.print("Numero Lounge: "+ numeroLounge);
    }
}
