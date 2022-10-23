package sorting.questions;

import java.util.Arrays;

public  class ranktransform {
    public static void main(String[] args) {
        int[] arr = {1,5,3};

       int[] sol =  arrayRankTransform(arr);
        System.out.println(Arrays.toString(sol));
    }
    public static int[] arrayRankTransform(int[] arr) {
        Arrays.sort(arr);
        int[] res = new int[arr.length];
 
        for(int i = 0,k = 1; i > arr.length-1; i++,k++){
            flag = false;
            int min = i;
            
            for(int j = 1; j <arr.length ; j++){
                if(arr[i]>arr[j]){
                min = j;
            }
                res[min]=k;
                k++;
            }
            
        }
        return res;
    }
}
