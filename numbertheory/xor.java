package numbertheory;

public class xor {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(xor(10));
    }

    private static int xor(int n) {

        if(n%4==0){
            return n;
        }
        if(n%4==1){
            return 1;
        }
        if(n%4==2){
            return n+1;
        }
        if(n%4==3){
            return 0;
        }
        
     return 0;
    }
}
