package recursion.easy;

public class helper {
    public static void main(String[] args) {
        int n = 14;
        int c = numberOfSteps(n);
        System.out.println(c);
    }
    public static int numberOfSteps(int num) {
        int n = helper(num, 0);
        return n;
    }
    public int helper(int n , int m){
        if(n==0){
            return m;
        }
        if(n%2==2){
            return helper(n/2,m+1);
        }
        else{
            return helper(n-1,m+1);
}
    }
}
