package numbertheory;

public class factors {
    public static void main(String[] args) {
        factors(50);
    }
    public static void factors(int n ){
        for(int i = 0; i <= n; i++){
            if(n%1==0){
                System.out.print(i+ " ");
            }
        }
    }
}
