package numbertheory;

public class gcd {
    public static void main(String[] args) {
        System.out.println(euclidiangcd(4, 9));
        ;
    }

    public static int euclidiangcd(int a, int b) {

        if (a == 0) {
            return b;
        }

        return euclidiangcd(b % a, a);

    }
}
