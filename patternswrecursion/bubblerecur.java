package patternswrecursion;

import java.util.Arrays;

public class bubblerecur {
    public static void main(String[] args) {
        int[] arr = {2,3,1,8,7,6,4,5};
        bubble(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
    

    private static void bubble(int[] arr, int len, int ind) {
        if(len==0){
            return;
        }
      if(ind<len){

        if(arr[ind]>arr[ind+1]){
            swap(ind,ind+1,arr);

        }
        bubble(arr, len, ind+1);
    }
        else{
            bubble(arr, --len, 0);
        }
    }

    private static void swap(int a, int b, int[] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b]= temp;
    }
}
