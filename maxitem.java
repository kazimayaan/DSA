import java.util.Scanner;

public class maxitem {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner in = new Scanner(System.in);

            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
                
            }
            int max= 0;
            for (int i = 0; i < arr.length; i++) {
                if(max<arr[i]){
                    max= arr[i];
                }
            }
            System.out.println("the maximum of array is " + max);
            in.close();
}}
