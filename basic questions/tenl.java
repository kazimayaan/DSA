import java.util.Scanner;
public class tenl {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the fruit");
        String a = in.next();



        switch(a){
            case "apple": System.out.println("sweet red fruit"); break;
            case "mango": System.out.println("King of fruits"); break;
            case "kiwi": System.out.println("noob of fruits"); break;
            case "grape": System.out.println("best of fruits"); break;
            default: System.out.println("enter valid fruit nigga");
            
        }

        System.out.println("enter the number of day ");
        int d= in.nextInt();

        switch(d){
            case 1 -> System.out.println("the day of " + d + " is Monday");
            case 2 -> System.out.println("the day of " + d + " is Tuesday");
            case 3 -> System.out.println("the day of " + d + " is WEDNESDAY");
            case 4 -> System.out.println("the day of " + d + " is thursday");
            case 5 -> System.out.println("the day of " + d + " is Friday");
            case 6 -> System.out.println("the day of " + d + " is Saturday");
            case 7 -> System.out.println("the day of " + d + " is Sunday");
        }

    
        in.close();



    
    }
}
