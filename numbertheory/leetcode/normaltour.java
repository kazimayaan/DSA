package numbertheory.leetcode;

public class normaltour {
    public static void main(String[] args) {
        int n = 14;
        System.out.println(number);
    }
    static int m = 0;
    public int numberOfMatches(int n) {
        if(n==2){
            return m +1;
        }
        if(n<=1){
            return 0;
        }
        if(n%2==0){
            m = m + n/2;
           return numberOfMatches(n/2);
        }
        m = m +n/2;
     return    numberOfMatches(n/2 +1);
    }    
}
