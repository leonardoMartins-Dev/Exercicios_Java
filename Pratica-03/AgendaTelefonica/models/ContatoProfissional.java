package models;

public class ContatoProfissional extends Contato{
    private String empresa;
    private String cargo;

    public ContatoProfissional(String nome, String email, String telefone, String empresa, String cargo){
        super(nome, email, telefone);
        this.empresa=empresa;
        this.cargo=cargo;
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("Empresa: "+ empresa);
        System.out.println("Cargo: "+ cargo);
    }

    
    //GETTERS & SETTERS
    public String getEmpresa() {
        return empresa;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    
}
