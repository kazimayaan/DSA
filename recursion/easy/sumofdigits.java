package recursion.easy;
public class sumofdigits {
    public static void main(String[] args) {
        int n = 1056;
        int sum = sumofdgits(n);
        System.out.println(sum);
    }

    private static int sumofdgits(int n) {
        if(n==0){
            return 0;
        }
        int rem = n % 10;
        // sum = sum + rem;
        return rem + sumofdgits(n/10);
    }
}
