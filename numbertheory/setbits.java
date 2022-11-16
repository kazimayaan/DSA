package numbertheory;

public class setbits {
    public static void main(String[] args) {
        int n = 7;
        int ans = 0;
        while(n>0){
            if((n&1)==1){
                ans++;
            }
            n= n>>1;
        }
        System.out.println(ans);
        int m= 45;
        System.out.println("===============better solution===========");
        int c = 0;
        while(m>0){
            c++;
            n = n-(n& -1);
        }
        System.out.println(c);
        
    }
}
