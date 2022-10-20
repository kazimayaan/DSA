package sorting;

import java.util.Arrays;

public class selectionsort { 
    public static void main(String[] args) {
 int[] arr = {1,10,11,5,4,2,3,7};
//  swap(arr, 2, 0);
            selectinsort(arr);
            System.out.println(Arrays.toString(arr));
    }

    private static void selectinsort(int[] arr) {
        
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length -i -1;
            int max =  GetMaxIndex(arr,0,last);
            swap(arr,last,max);
        }
    }
    // just swap the max index with the last element

    private static int GetMaxIndex(int[] arr, int syart, int last) {
        int max = syart;
        for (int i = 0; i <= last; i++) {
            if(arr[max]<arr[i]){
                max=i;
            }

            

        }
        return max;
    }
    private static void swap (int[] arr, int first, int second){
        int temp;
        temp = arr[first];
        arr[first]= arr[second];
        arr[second]=temp;
    }
 }
