package numbertheory;

public class poweroftwo {
    public static void main(String[] args) {
        int n = 8;
        if(n == 0){
            System.out.println(false);

        }
        boolean ans = (n& (n-1))==0;
        System.out.println(ans);
    }
}
