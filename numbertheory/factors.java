package numbertheory;

public class factors {
    public static void main(String[] args) {
        factors(50);
    } 
    public static void factors(int n ){
        for(int i = 1; i <= n; i++){
            if(n%i==0){
                System.out.print(i+ " ");
            }
        }
    }
}
