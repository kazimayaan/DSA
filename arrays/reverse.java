import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        int num= in.nextInt();
        int n= num;
        // int c = 0;
         int f= 0;
         int res= 0;
        while(n>0){
            int rem = n%10;
            f = rem;
            res= res*10 + f;
            n = n/10;
        }
        System.out.println(res);
in.close();
        
    }
}
