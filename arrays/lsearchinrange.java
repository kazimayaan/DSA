import java.util.Arrays;
import java.util.Scanner;

public class lsearchinrange {
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
        System.out.println("enter the item to search");
        int item = in.nextInt();
        System.out.println("enter the starting range of search");
        int si = in.nextInt();
        System.out.println("enter the ending range of search");
        int ei = in.nextInt();

        int index= search(arr,item, si, ei);

        if(index>=0){
            System.out.println("the element successfully found  in " + index + "th position");
        }
        else{
            System.out.println("element not found");
        }
in.close();

    }

    private static int search(int[] arr, int item, int si, int ei) {
        // return 0;
        if(arr.length==0){
            return -1;
        }
        for (int i = si; i <= ei; i++) {

            if(arr[i]==item){
                return i;
            }
            
        }
        return -1;
    }
}
