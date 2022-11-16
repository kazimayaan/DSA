package numbertheory;

public class nthmagicnumber {
    public static void main(String[] args) {
        int n = 8;

        int ans = 0;
        while(n>0){
            int last = n&1;
            n= n>>1;
            ans = Math.pow(ans, last)
        }




        System.out.println(ans);
    }
}
