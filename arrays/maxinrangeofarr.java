import java.util.Arrays;
import java.util.Scanner;
public class maxinrangeofarr {
// public class minimumarr {

// public class lsearchinrange {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        System.out.println("enter the length of array");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n  ; i++) {

            arr[i]=in.nextInt();
            
        }

        System.out.println("your array is");
        System.out.println(Arrays.toString(arr));
        System.out.println("enter the starting range of search");
        int si = in.nextInt();
        System.out.println("enter the ending range of search");
        int ei = in.nextInt();

        int index= searchmin(arr, si, ei);

        if(index==10000){
            System.out.println("the search is unsuccessful");
        }
        else{
            System.out.println("maximum is " 
            + index);
        }
in.close();

    }

    private static int searchmin(int[] arr, int si, int ei) {
        // return 0;

        if(arr.length==0){
            return 10000;
        }
        int item= arr[0];
        for (int i = si; i <= ei; i++) {

           if(item<arr[i]){
            item = arr[i];
            
           }
            
        }
        return item;
    }


}

// }
