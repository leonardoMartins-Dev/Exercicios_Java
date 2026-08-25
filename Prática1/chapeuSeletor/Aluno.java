public class Aluno {
    private String nome;
    private int idade;
    private int coragem;
    private int inteligencia;
    private int ambicao;
    private int lealdade;
    private int estrategia;
    private int criatividade;
    private String casa;

    public Aluno(String nome, int idade, int coragem, int inteligencia, int ambicao, int lealdade, int estrategia, int criatividade){
        this.nome = nome;
        this.idade = idade;
        this.coragem = coragem;
        this.inteligencia = inteligencia;
        this. ambicao = ambicao;
        this.lealdade = lealdade;
        this.estrategia=estrategia;
        this.criatividade=criatividade;
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
            this.casa = "Lufa-Lufa";
        }
        
    }

    public void exibirInfos(){
        System.out.println("Aluno: "+ nome);
        System.out.println("idade: "+ idade);
        System.out.println("coragem: "+ coragem);
        System.out.println("inteligencia: "+ inteligencia);
        System.out.println("ambicao: "+ ambicao);
        System.out.println("Lealdade: "+ lealdade);
        System.out.println("Estrategia: "+ estrategia);
        System.out.println("Criatividade: "+ criatividade);
        System.out.println("casa: "+ casa);
    }



    //GETTERs and SETTERs
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
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
    public String getCasa() {
        return casa;
    }
    public void setCasa(String casa) {
        this.casa = casa;
    }

    
}
