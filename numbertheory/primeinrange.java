package numbertheory;

public class primeinrange {
    public static void main(String[] args) {
        int n = 40;
        for(int i = 0; i < n; i++){
            if(isprime(i)==true){
                System.out.println(i + " isprime ");
            }
        }
    }
    private static boolean isprime(int n) {
 
        if(n<2){
            return false;
        }
        int c = 2;
        // clean code same as root n c<
        while(c*c<=n){

            if(n%c==0){
                return false;
            }
            c++;

        }
        return true;
    }
}
