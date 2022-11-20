package numbertheory;

public class prime {
    public static void main(String[] args) {
        int num = 50;
for(int i = 0; i < num+1; i++ ){


        System.out.println(i + " is " + isprime(i));
}
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
