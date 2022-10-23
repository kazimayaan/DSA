import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {

        int a = 0;
        int b= 1;
        // int k= 2;
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        for (int c = 2; c <=n; c++) {

         int temp= b;
         b= a+b;
         a=temp;

        }
        System.out.println(b);

        int p= 0 ;
        int i= 1;
        int count=2;
        while(count<=n){
            int temp = i;
            i = i+p;
            p = temp;
            count++;
        }
        System.out.println(i);
        in.close();
    }

}
