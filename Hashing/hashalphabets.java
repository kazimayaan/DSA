package Hashing;

import java.util.Arrays;
import java.util.Scanner;

public class hashalphabets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int n = in.nextInt();
        String str = in.next();
        int[] hash = new int[256];
        for(int i =0; i < str.length(); i++){
            hash[str.charAt(i)] +=1 ;
        }
        System.out.println(Arrays.toString(hash));
        char c = in.next().charAt(0);
        System.out.println(hash[c]);

    }
}
