package numbertheory;

public class powerbinary {
    public static void main(String[] args) {
        int base = 3;
        int power = 6;

        int ans = 1;
        int k = 111010;
        int count = 0;
        for(int i = 0; i< 5; i++){
            // System.out.println(k);
            if((k&1) == 1){
                count++;
            }
            k = k>>1;
            
        }
        System.out.println(count);
        while(power>0){
            if((power&1)==1){
                ans*= base;
            }
            base*=base;
            power= power>>1;
        }
        System.out.println(ans);
    }
    // complexity is log of power
}
