package sorting;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        // bubble sort also known as syncing sort or exchange sort
        int[] arr = {1,5,3};

        bubbllesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbllesort(int[] arr) {
        
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
        // each iteration the max element is being pushed to the last index
            swapped = false;
            for (int j = 1; j < arr.length-i; j++) {
                if( arr[j]<arr[j-1]){
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }

            }
            if(swapped==false){
                break;
            }
            // emhanced loops
        }
    }
}
