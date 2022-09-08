import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter the number ");
        int a = in.nextInt();
        boolean x = isArm(a);
        System.out.println(x);
        in.close();
        for (int i = 100; i < 1000; i++) {

            if(isArm(i)){
                System.out.print(i+ " ");
            }
            
        }
    }

    private static boolean isArm(int a) {
        int sum = 0;
        int t = a;
        // System.out.println(t);

        while (a > 0) {
            int rem = a % 10;
            sum = sum + rem * rem * rem;
            // System.out.println(sum);
            a = a / 10;
        }
        if (sum == t) {
            // System.out.println("it is an armstrong number");
            return true;
        } else {

            return false;
        }
    }
}
