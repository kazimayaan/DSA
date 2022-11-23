package recursion.easy;

public class palindrome {
    public static void main(String[] args) {
        int n = 1234321;
        System.out.println(ispali(n));
    }

private static boolean ispali(int n) {
      int m = rev(n);
      if(m==n){
        return true;
      }
      return false;
    }

private static int rev(int n) {
    
    return 0;
}

}
