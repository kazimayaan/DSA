package sorting.cyclesort;

import java.util.Arrays;

public class cyclesort {
    public static void main(String[] args) {
        // when given numbers from range 1 to N => use cyclic sort
        // 1 to N is cyclic sort
        // 
        // we need only n comparisons in cyclic sort
        // /very veyr very very // important 
        int[] arr = {1,7,6,5,4,3,2,8};
        cyclesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void cyclesort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!= i+1){
                swap(i,arr[i],arr);
            }
            else{
                continue;
                
            }
        }
    }

    private static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
