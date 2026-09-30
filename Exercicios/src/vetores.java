public class vetores {
    public static void main(String[] args) {
        int[] ListaInteiros = {1,2,3,4,5};
        int leituraLista= ListaInteiros.length;
        System.out.println("O tamanho da lista é de "+ leituraLista + " numeros.");
        for(int i=0; i<leituraLista; i++){
            System.out.println(ListaInteiros[i]);
        }
    }
}
