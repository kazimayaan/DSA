import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        // q: ip 2 no and print sum

        Scanner in = new Scanner(System.in);
        // sum();
        int result;
        result = lol();
        System.out.println(result);
        String ak = greet();
        System.out.println(ak);

        in.close();
    }

    static void sum() {

        Scanner in = new Scanner(System.in);

        System.out.println("enter the first number");
        int a = in.nextInt();
        System.out.println("enter the second number");
        int b = in.nextInt();
        int sum = a + b;
        System.out.println("the sum of the two numbers is " + sum);
        in.close();
    }

    static int lol() {
        Scanner ll = new Scanner(System.in);
        System.out.println("enter n1");
        int x = ll.nextInt();
        System.out.println("enter n2");
        int y = ll.nextInt();
        int res = x + y;
        ll.close();
        return res;

    }

    static String greet() {
        String greeting = "How are you ";
        return greeting;
    }
}
