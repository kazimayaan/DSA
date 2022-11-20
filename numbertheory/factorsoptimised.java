package numbertheory;

public class factorsoptimised {
    public static void main(String[] args) {
        factors(36);
    } 
    public static void factors(int n ){
        for(int i = 1; i*i <= n; i++){
            if(n%i==0){
                int x = n/i;
                if(x==i){
                    System.out.println(i+" ");
                }
                else{

                

                System.out.print(i+ " " + x+" ");
                }
                // o(sqrt(n)) complexity
            }
        }
    }
}
