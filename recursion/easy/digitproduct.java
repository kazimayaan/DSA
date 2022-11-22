package recursion.easy;

public class digitproduct {
    public static void main(String[] args) {
        int n = 12347;
        int pro = digitproduct(n);
        System.out.println(pro);
    }

    private static int digitproduct(int n) {
        if(n==0){
            return 1;
        }
        return (n%10) * digitproduct(n/10);
    }
}
