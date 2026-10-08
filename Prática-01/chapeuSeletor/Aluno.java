import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;


public class Aluno {
    private int id;
    private String nome;
    private String sobrenome;
    private int idade;
    private LocalDate dataNascimento;
    private String codigoMatricula;
    private int coragem;
    private int inteligencia;
    private int ambicao;
    private int lealdade;
    private int estrategia;
    private int criatividade;
    private String casa;

    public Aluno(int id, String nome, String sobrenome, LocalDate dataNascimento, int coragem, int inteligencia, int ambicao, int lealdade, int estrategia, int criatividade){
        this.id= id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.coragem = coragem;
        this.inteligencia = inteligencia;
        this. ambicao = ambicao;
        this.lealdade = lealdade;
        this.estrategia=estrategia;
        this.criatividade=criatividade;
    }

    public void calcularIdade(){
        LocalDate hoje = LocalDate.now();
        int idadeCalculada = Period.between(dataNascimento, hoje).getYears();
        this.idade = idadeCalculada;
    }

    public boolean verificarMaioridade(){
        if(idade>=18){
            return true;
        }else{
            return false;
        }
    }

    public String formatarCasa(){
        return casa.toUpperCase();
    }

    public void gerarMatricula(){
        char char1 = nome.charAt(0);
        char char2 = sobrenome.charAt(0);
        String posicao1 = String.valueOf(char1)+String.valueOf(char2);
        int anoNascimentop=dataNascimento.getYear();
        String posicao2=String.valueOf(anoNascimentop);
        String identificador= String.valueOf(id);
    
        this.codigoMatricula = posicao1.toUpperCase()+"-"+posicao2+"-"+id;
    }

    public boolean verificarCasa(){
        return !(casa.isEmpty());
    }
    public boolean verificarSobrenome(){
        return !(sobrenome.isEmpty());
    }

    public void calcularCasa(){
        int grifinoria = (2*coragem)+lealdade;
        int sonserina = (2*ambicao)+estrategia;
        int corvinal = (2*inteligencia)+criatividade;
        int lufa_lufa = ((2*lealdade)+coragem)/3;
        
        int[] casas = {grifinoria, sonserina, corvinal, lufa_lufa};
        
        int maior = grifinoria;
        for(int i = 0; i<casas.length; i++){
            if( casas[i]>maior){
                maior = casas[i];
            }
        }

        if (maior == grifinoria){
            this.casa = "Grifinória";
        }else if ( maior == sonserina){
            this.casa = "Sonserina";
        }else if (maior == corvinal){
            this.casa = "Corvinal";
        }else if (maior == lufa_lufa){
            this.casa = "LufaLufa";
        }
        
    }



//GETTERs and SETTERs
    public void exibirInfos(){
        System.out.println("id: "+ id);
        System.out.println("Aluno: "+ nome);
        System.out.println("Sobrenome: "+ sobrenome);
        System.out.println("data de nascimento: "+ dataNascimento);
        System.out.println("Matricula: "+ codigoMatricula);
        System.out.println("idade: "+ idade);
        System.out.println("coragem: "+ coragem);
        System.out.println("inteligencia: "+ inteligencia);
        System.out.println("ambicao: "+ ambicao);
        System.out.println("Lealdade: "+ lealdade);
        System.out.println("Estrategia: "+ estrategia);
        System.out.println("Criatividade: "+ criatividade);
        System.out.println("casa: "+ casa);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCodigoMatricula() {
        return codigoMatricula;
    }

    public void setCodigoMatricula(String codigoMatricula) {
        this.codigoMatricula = codigoMatricula;
    }

    public int getCoragem() {
        return coragem;
    }

    public void setCoragem(int coragem) {
        this.coragem = coragem;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getAmbicao() {
        return ambicao;
    }

    public void setAmbicao(int ambicao) {
        this.ambicao = ambicao;
    }

    public int getLealdade() {
        return lealdade;
    }

    public void setLealdade(int lealdade) {
        this.lealdade = lealdade;
    }

    public int getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(int estrategia) {
        this.estrategia = estrategia;
    }

    public int getCriatividade() {
        return criatividade;
    }

    public void setCriatividade(int criatividade) {
        this.criatividade = criatividade;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }
    
}
