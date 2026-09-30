public class Multiplo3FIZZ {
    public static void main(String[] args){
        int n = 20;
        for(int i=0; i<n+1; i++){
            if(i%3==0){
                System.out.println(i + "Fizz");
            }else{
                System.out.println(i);
            }
        }
    }
}
