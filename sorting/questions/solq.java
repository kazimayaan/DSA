package sorting.questions;
import java.util.Arrays;


public class solq {
    public static void main(String[] args) {
        // bubble sort also known as syncing sort or exchange sort
        int[] arr = {1,5,3};

        bubbllesort(arr);
        System.out.println(Arrays.toString(arr));
System.out.println(bubbllesort(arr));

        
    }

    private static Boolean bubbllesort(int[] arr) {
        
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
        int diff = arr[1]-arr[0];
        for (int index = 0; index < arr.length-1; index++) {
            if(arr[index+1]-arr[index]!=diff){
                return false;
            }
        }
        return true;
    }
}
