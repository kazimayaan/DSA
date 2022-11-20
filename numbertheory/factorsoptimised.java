package numbertheory;

public class factorsoptimised {
    public static void main(String[] args) {
        factors(20);
    } 
    public static void factors(int n ){
        for(int i = 1; i*i <= n; i++){
            if(n%i==0){
                int x = n/i;

                System.out.print(i+ " " + x+" ");
                // o(sqrt(n)) complexity
            }
        }
    }
}
