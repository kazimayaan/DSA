package numbertheory;

public class gcd {
    public static void main(String[] args) {
        int a = 2; int b = 7;
        System.out.println(euclidiangcd(3, 7));
        System.out.println("LCM ");
        int lcm = a*b/euclidiangcd(a,b);
        System.out.print(lcm);
    }

    public static int euclidiangcd(int a, int b) {

        if (a == 0) {
            return b;
        }

        return euclidiangcd(b % a, a);

    }
}
