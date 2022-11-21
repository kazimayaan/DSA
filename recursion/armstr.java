package recursion;

public class armstr {
    public static void main(String[] args) {
        int n = 153;
        System.out.println(isarm(n));
    }

    private static boolean isarm(int n) {
        int x = n;
        int ans = 0;
        while(x>0){
            int y = x%10;
            ans = ans + (y*y*y);
            x = x/10;
        }
        System.out.println(ans);
        if(ans==n){
            return true;

        }
        return false;
    }
}
