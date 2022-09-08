import java.util.Scanner;

public class nestedswitch {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("enter the employee name");
        int emd= in.nextInt();
        System.out.println("enter the department");
        String dpt = in.next();

        switch(emd){
            case 1 -> System.out.println("ceo");
            case 2 -> System.out.println("vc");
            case 3 -> System.out.println("cmo");
            case 4 -> {switch(dpt){
                                    case "it"->System.out.println("Information Technology");
                                    case "me"->System.out.println("Mechanical");
                                    case "ece"->System.out.println("Electronic and Communication Ele");
                                    case "cs"->System.out.println("Computer Science");
                                    default -> System.out.println("enter valid nigg");

            }

    }
    default -> System.out.println("enter a valid pne nigga");


}
in.close();
    }
}
