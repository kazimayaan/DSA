import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("welcome to calculator");
        // float result;
        // System.out.println("do you want to coninue? press x or X to exit");
        // char status = in.next().trim().charAt(0);

        while (true) {
            System.out.println("choose the operator (+,-,*,/) and x or X to leave");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/') {
                System.out.println("enter the first number");
                float n1 = in.nextFloat();
                System.out.println("enter the second number");

                float n2 = in.nextFloat();

                if (op == '+') {
                    System.out.println((n1 + n2));
                    continue;
                } else if (op == '-') {
                    System.out.println((n1 - n2));
                    continue;

                } else if (op == '*') {
                    System.out.println((n1 * n2));
                    continue;

                }
              
                else {
                    System.out.println((n1 / n2));
                    continue;
                }

            }
            else if(op == 'x' || op == 'X'){
                System.out.println("byee");
                break;
            }
            
            
            else{
                System.out.println("operator not valid");
            }
        }
        in.close();
    }
}
