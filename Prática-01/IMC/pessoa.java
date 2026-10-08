public class pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private double altura;
    private double peso;
    private double IMC;

    public pessoa(String nome, String sobrenome, int idade, double altura, double peso){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public void calcularIMC(){
        this.IMC = peso/(altura*altura);
        System.out.println("O IMC é de: "+ IMC);
    }
    public void informarObesidade(){ 
        if(IMC<18.5){
            System.out.println("Abaixo do peso");
        }else if(IMC>=18.5 && IMC<=24.9){
            System.out.println("peso normal");
        }else if (IMC>=25 && IMC<=29.9){
            System.out.println("Sobrepeso");
        }else if (IMC>=30 && IMC <=34.9){
            System.out.println("Obesidade grau 1");
        }
        else if (IMC>=35 && IMC<=39.9){
            System.out.println("Obesidade grau 2");
        }else if (IMC>=40){
            System.out.println("Obesidade grau 3");
        }
    }




    //GETERs and SETTERs
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
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getIMC(){
        return IMC;
    }
    public void setIMC(double IMC){
        this.IMC = IMC;
    }
}
