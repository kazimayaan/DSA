package Hashing;
import java.util.Arrays;
import java.util.Scanner;

public class hashnumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int[] hash = new int[13];
        // System.out.println(Arrays.toString(hash));
        for (int i = 0; i < n; i++) {
            hash[arr[i]]+=1;
        }
        System.out.println(Arrays.toString(hash));
        int j = in.nextInt();
        for(int i = 0; i < j; i++){
            int k = in.nextInt();
            System.out.println(hash[k]);
        }
    }    
}
