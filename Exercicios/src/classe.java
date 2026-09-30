import java.util.Scanner;
public class classe {
    public static void main(String[] args){

        aluno a1 = new aluno("Leo", 908180, 100, 75);
        a1.exibir();
        double media = a1.media();
        System.out.println(media);
    }
}
class aluno{
    private String nome;
    private int matricula;
    private int nota1;
    private int nota2;
    public aluno(String nome, int matricula, int nota1, int nota2){
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    public double media(){
        int media= (this.nota1 + this.nota2)/2;
        return media;
    }
    public void exibir(){
        System.out.println("Aluno: "+ this.nome);
        System.out.println("Matricula: "+ this.matricula);
        System.out.println("Nota 1: "+ this.nota1);
        System.out.println("Nota 2: "+ this.nota2);
    }
}
