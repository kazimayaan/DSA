package numbertheory;

import java.util.Arrays;

public class optimisedprime {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n+1];
        sieve(n,primes);
        System.out.println(Arrays.toString(primes));
    }
    static void sieve(int n, boolean[] prime){

        for(int i = 2; i*i<=n; i++){
            if(prime[i]==false){
                for(int j = i*2; j<=n; j+=i){
                    prime[j]=true;
                }
            }
        }
        for(int i = 2; i<= n; i++){
            if(!prime[i]){
                System.out.println(i+ " ");
            }
        }
        

    }
}
