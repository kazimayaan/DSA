import java.util.Scanner;

public class typecheck {
    public static void main(String[] args) {
        System.out.println("enter the character whose type you want me to check");
        Scanner in = new Scanner(System.in);
        char a = in.next().trim().charAt(0);
        int j = a;
        System.out.println(j);

        if(j>64 && j<91){
            System.out.println("its an upper case letter");
        }
        else if(j>96 && j<123){
            System.out.println("it is a lower case letter");
        }
        else{
            System.out.println("it is not a letter at all");
        }


        System.out.println("next way");

        if(a>='a' && a<='z'){
            System.out.println("lower");
        }
        else{
            System.out.println("upper");
        }
    }
}
