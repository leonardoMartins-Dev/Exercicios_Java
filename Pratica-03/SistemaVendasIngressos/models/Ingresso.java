package models;

public abstract class Ingresso {
    protected int codigo;
    protected String nomeEvento;
    protected String setor;
    protected Double valorBase;

    public Ingresso(int codigo, String nomeEvento, String setor, Double valorBase){
        this.codigo=codigo;
        this.nomeEvento=nomeEvento;
        this.setor=setor;
        this.valorBase=valorBase;
    }



    public void exibir(){
        System.out.println("Codigo: "+codigo);
        System.out.println("Nome evento: "+nomeEvento);
        System.out.println("Setor: "+setor);
        System.out.println("Valor base: "+valorBase);
    }

    public abstract double calcularValorFinal();
    public abstract String obterBeneficios();

    //GETTERS SETTERS
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Double getValorBase() {
        return valorBase;
    }

    public void setValorBase(Double valorBase) {
        this.valorBase = valorBase;
    }


}
