package sorting;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        // bubble sort also known as syncing sort or exchange sort
        int[] arr = {2,3,4,1,6,5,7,10,8,9};

        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubblesort(int[] arr) {
        

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if( arr[j]<arr[j-1]){
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
