public class fatorialRecursivo {
    public static void main(String[] args){
        int n = 7;
        System.out.println(fat(n));
    }
    public static int fat(int n){
        if(n==0){
            return 1;
        }else{
            return n*(fat(n-1));
        }
    }
}


