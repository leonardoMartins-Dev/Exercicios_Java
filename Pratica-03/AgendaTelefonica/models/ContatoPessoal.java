package models;

public class ContatoPessoal extends Contato{
    private String dataAniversario;
    private String parentesco;

    public ContatoPessoal(String nome, String email, String telefone, String data, String parentesco){
        super(nome, email, telefone);
        this.dataAniversario=data;
        this.parentesco=parentesco;
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("Data de aniversario: "+ dataAniversario);
        System.out.println("parentesco: "+ parentesco);
    }

    //GETTERS & SETTERS
    public String getDataAniversario() {
        return dataAniversario;
    }
    public void setDataAniversario(String dataAniversario) {
        this.dataAniversario = dataAniversario;
    }
    public String getParentesco() {
        return parentesco;
    }
    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

}
