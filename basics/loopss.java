import java.util.Scanner;
public class loopss {
    public static void main(String[] args) {
        
        System.out.println("how many numbers do you want");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
            
        }

        System.out.println("enter the number");
        int m = in.nextInt();
        int j=1;
        while(j<=m){
            System.out.print(j+ " ");
            j+=2;
        }

        int k= 1;
        int b = in.nextInt();
        do{
            System.out.print(k + " ");
            k+=2;
        }while(k<=b);
in.close();

    }
}
