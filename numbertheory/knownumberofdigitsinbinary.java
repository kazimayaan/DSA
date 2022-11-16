package numbertheory;

public class knownumberofdigitsinbinary {
    public static void main(String[] args) {
        int n = 342432;
        int base = 2;

        int ans = (int)(Math.log(n)/Math.log(base))+1;

        System.out.println(ans);
        int counter=0;
        while(n>0){
            counter++;
            n= n>>1;
        }
        System.out.println(counter);
    }
}
