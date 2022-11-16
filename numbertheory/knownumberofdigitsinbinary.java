package numbertheory;

public class knownumberofdigitsinbinary {
    public static void main(String[] args) {
        int n = 342432;
        int base = 10;

        int ans = (int)(Math.log(n)/Math.log(base))+1;

        System.out.println(ans);
    }
}
