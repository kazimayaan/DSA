import java.util.Scanner;
public class frequency {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("ente rthe value you want the frequency of ");
        int k = in.nextInt();
        int m = n;
        int count = 0;
        while(m>0){
            int rem = m%10;
            if(rem==k){
                count++;
            }
            m=m/10;
        }
        System.out.println(k + " has repeated " +count + " times in the number " + n);
    }
}
