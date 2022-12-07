package patternswrecursion;

import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int[] arr = {12,11,13,17,99,100};
        selection(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    private static void selection(int[] arr, int i, int j, int k) {
      if(i == 0){
        return;
      }
      if(j < i){

      
      if(arr[j]>arr[k]){
          selection(arr, i, j + 1, j);
          
        }
        else{
          selection(arr, i, j+1, k);

      }
    }
    else{
        swap(k, i-1, arr);
        selection(arr, --i, 0, 0);
    }

    }
    private static void swap(int a, int b, int[] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b]= temp;
    }
}
