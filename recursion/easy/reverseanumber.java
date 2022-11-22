package recursion.easy;

public class reverseanumber {
    public static void main(String[] args) {
        int n = 1342;
        int sum = reverseanumber(n, 0);   
        System.out.println(sum);
    }

    private static int reverseanumber(int n, int sum) {
        if(n%10==0){
            return sum;
        }
        sum = sum* 10 + (n%10);
        return reverseanumber(n/10,sum);
    }
}
