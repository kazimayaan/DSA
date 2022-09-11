import java.util.Arrays;
import java.util.Scanner;

public class leetcodeproblem11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter no of elements");
        int n  = in.nextInt();
        int[] num = new int[n];
                for (int i = 0; i < n; i++) {

                    num[i]= in.nextInt();
            
        }
        System.out.println(Arrays.toString(num));
        solution(num);
        in.close();
    }

    private static void solution(int[] num) {
        int item = 0;
        int k = 0;
        int[] sol = new int[num.length];
            for (int i = 0; i < num.length; i++) {
                item = num[i];
                if(item<0){
                    item = item*-1;
                }

                int length = length(item);
                if(length%2==0){
                    sol[k]=item;
                    k=k+1;
                }

                

            }
            System.out.println(k);
    }

    private static int length(int item) {
        if(item==0){
            return 0;
        }
int n = item;
        int l = 0;
        while(n>0){
            n=n/10;
            l++;

        }
        return l;
    }
    
}
