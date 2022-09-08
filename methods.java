import java.util.Scanner;
public class methods {
    public static void main(String[] args) {
        //q: ip 2 no and print sum

        Scanner in = new Scanner(System.in);
        sum();
        


in.close();
    }
    static void sum(){

        Scanner in = new Scanner(System.in);

        System.out.println("enter the first number");
        int a = in.nextInt();
        System.out.println("enter the second number");
        int b = in.nextInt();
        int sum= a+b;
        System.out.println("the sum of the two numbers is "+ sum);
        in.close();
    }
}
