package recursion.easy;

public class countzeroes {
    public static void main(String[] args) {
        int n = 30210;
        System.out.println(cz(n));
    }

    private static int cz(int n) {
      int sol = count(n,0);
      return sol;
    }

    private static int count(int n, int i) {
        if(n==0){
            return i;
        }
        if(n%10==0){
            i++;
        }
        return count(n/10,i);
    }
}
