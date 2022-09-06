import java.util.Scanner;

import javax.sound.sampled.FloatControl;

public class inputs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Hello whats your age");
        int age= sc.nextInt();
        System.out.println("your age is " + age);
        // sc.close();
        // System.out.print(age);
        System.out.println("Enter your name ");
        String name= sc.next();
        System.out.println("Enter your marks");
        float marks = sc.nextFloat();
        sc.close();

        System.out.println("Your age is " + age +  ", Your name is " +name + " and your Marks is " +marks + ".");
    }
    
}
