package sorting;

import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
 int[] arr = {1,5,6,7,3,2,4,10,9};
selectinsort(arr);
 System.out.println(Arrays.toString(arr));
    }

    private static void selectinsort(int[] arr) {
        
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length -i;
            int max =  GetMaxIndex(arr,0,last);

        }
    }

    private static int GetMaxIndex(int[] arr, int syart, int last) {
        int max = syart;
        for (int i = 0; i < arr.length; i++) {
            if(arr[max]<arr[i]){
                max=i;
            }

        }
        
    }
}
