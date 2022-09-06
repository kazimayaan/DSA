import java.util.Scanner;
public class sum {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("enter the first number ");
        int a = input.nextInt();
        System.out.println("enter the second number ");
        int b = input.nextInt();
        int c = a+b;

        System.out.println("the sum of two numbers is " + c);
        
    }
}
