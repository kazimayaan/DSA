package numbertheory;

public class prime {
    public static void main(String[] args) {
        int num = 14;
        System.out.println(isprime(num));
    }

    private static boolean isprime(int n) {

        if(n<2){
            return false;
        }
        int c = 2;
        // clean code same as root n c<
        while(c*c<n){

            if(n%c==0){
                return false;
            }
            c++;

        }
        return true;
    }
}
