package recursion.easy;

public class palindrome {
    public static void main(String[] args) {
        int n = 1234321;
        System.out.println(ispali(n));
    }

private static boolean ispali(int n) {
      int m = rev(n,0);
      if(m==n){
        return true;
      }
      return false;
    }

private static int rev(int n, int ans) {
    if(n==0){
        return ans;
    }
    ans = ans*10 + (n%10);
    return rev(n/10,ans);
}

}
