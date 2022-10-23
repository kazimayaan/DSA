import java.util.Scanner;

public class questions {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("enter the number to check");
        int a = in.nextInt();
        boolean ans = isPrime(a);
        System.out.println(ans);
        in.close();
    }

    private static boolean isPrime(int a) {
        if(a<=1){
                    return false;

        }
        int c=2;
        while(c*c<=a){
            if(a%c == 0){
               return false;
            }
            c++;
        }
        return true;
    }
}
