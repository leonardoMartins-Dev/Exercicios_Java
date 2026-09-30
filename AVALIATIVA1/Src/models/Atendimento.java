package Src.models;


public class Atendimento {
    private String codigo;
    private String nomeAnimal;
    private String especie;
    private String nomeTutor;
    private String data;
    private String horario;
    private String status;
    private String obs;
    private Procedimento procedimento;
    private Sala sala;

    public Atendimento(String codigo, String nomeAnimal,String especie,String nomeTutor, String data, String horario, String obs, Procedimento procedimento){
        this.codigo = codigo;
        this.nomeAnimal = nomeAnimal;
        this.especie = especie;
        this.nomeTutor = nomeTutor;
        this.data = data;
        this.horario = horario;
        this.status = "agendado";
        this.obs = obs;
        this.procedimento = procedimento;
        this.sala = null;
    }

    public void iniciar(Sala sala){
        this.sala = sala;
        this.status = "em andamento";
    }

    public boolean finalizar(){
        if (!status.equals("em andamento")) {
            return false;
        }
        sala.removerAtendimento(this);
        status = "finalizado";
        return true;
    }

    public void exibir(){
        System.out.println("------------------------------");
        System.out.println("Codigo: " + codigo);
        System.out.println("Animal: " + nomeAnimal + " (" + especie + ")");
        System.out.println("Tutor: " + nomeTutor);
        System.out.println("Data: " + data + " as " + horario);
        System.out.println("Status: " + status);
        System.out.println("Observacoes: " + obs);
        procedimento.exibir();
        if (sala == null) {
            System.out.println("Sala: nao atribuida");
        } else {
            sala.exibir();
        }
    }



    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNomeAnimal() {
        return nomeAnimal;
    }
    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public String getNomeTutor() {
        return nomeTutor;
    }
    public void setNomeTutor(String nomeTutor) {
        this.nomeTutor = nomeTutor;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public String getStatus() {
        return status;
    }
    public String getObs() {
        return obs;
    }
    public void setObs(String obs) {
        this.obs = obs;
    }
    public Procedimento getProcedimento() {
        return procedimento;
    }
    public Sala getSala() {
        return sala;
    }
}
