package recursion.easy;

public class factorial {
    public static void main(String[] args) {
        System.out.println(fact(7));
    
    }

    private static int fact(int i) {
        if(i<=1){
            return 1;
        }
        return i*fact(i-1);
        
    }
}
