package mergesort;

import java.util.Arrays;

public class merge {
    public static void main(String[] args) {
        int[] arr = {1,6,3,4,2,9,19};
        int[] lol = mergesort(arr);
        System.out.println();

    }
    static int[] mergesort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left,right);
    }
    private static int[] merge(int[] left, int[] right) {
        int[] mix = new int[left.length+right.length ];
        int i = 0; 
        int j = 0; 
        int k = 0;
        while(i<left.length && j < right.length){
            if(left[i]<right[j]){
                mix[k]=left[i];
                k++;
                i++;
            }
            if(right[j]<left[i]){
                mix[k]=right[j];
                j++;
                k++;
            }
        }
        return mix;
    }
}
