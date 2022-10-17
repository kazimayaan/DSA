package sorting.cyclesort;

import java.util.Arrays;

public class cyclesortbykunal {
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,8,7,6,9,5};
        cyclesortbykunal(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void cyclesortbykunal(int[] arr) {


        int i = 0;
        while(i < arr.length){
            int correct = arr[i] -1;
            if(arr[i] != arr[correct]){
                swap(arr, correct,i);
            }
            else{
                i++;
            }
        }
    }

    private static void swap(int[] arr, int correct, int i) {
        int temp = arr[correct];
        arr[correct]= arr[i];
        arr[i]=temp;
    }


}
