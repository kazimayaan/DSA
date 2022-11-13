package numbertheory;

public class odd {
    public static void main(String[] args) {
        int i = 44;
        System.out.println(isodd(i));
    }

    private static boolean isodd(int i) {
        return (i&1)==1;
    }
}
