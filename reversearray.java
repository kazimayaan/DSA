import java.util.Arrays;
import java.util.Scanner;
public class reversearray {

// public class swaparray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner in = new Scanner(System.in);

            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
                
            }

            swapa(arr, 0, 4);

            System.out.println(Arrays.toString(arr));
            
            reverses(arr);
            
            System.out.println(Arrays.toString(arr));




        in.close();
    }

    private static void reverses(int[] arr) {

        int start = 0;
        int end = arr.length-1;

        while(start<end){
            swapa(arr, start, end);
            start+=1;
            end-=1;
        }
    }

    private static void swapa(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j ] = temp;

    }


   


}
