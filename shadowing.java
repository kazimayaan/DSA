import java.net.SocketTimeoutException;

public class shadowing {
    static int x = 90;
    //global variables
    public static void main(String[] args) {
        System.out.println(x);
        int x = 40;

        for (int index = 0; index < 10; index++) {
            // SocketTimeoutException
            System.out.println(x);
        }
        fun();

        
    }
    private static void fun() {
        System.out.println(x);
    }

}
