import java.util.Scanner;
public class methods2 {
public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    System.out.println("hello, pls give first number ");
    int x = in.nextInt();
    System.out.println("hello, pls give second number ");
    int y = in.nextInt();
    int result = sum(x,y);
    System.out.println("the result of sum method is " + result);
    System.out.println("enter yiur name pls");
    String name = in.next();
    String greet= mygreet(name);
    System.out.println(greet);
    in.close();

}
static int sum(int a, int b){
    int sum = a+b;
    return sum;
}
    static String mygreet(String name){
            String msg = "Hello " + name + ",How are you?";
            return msg;
    }
}
