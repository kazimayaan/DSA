package recursion;

import java.util.Arrays;

public class quicksort {
    public static void main(String[] args) {
    int[] arr= {5,4,3,2,1};
    qsort(arr,0,arr.length-1);
    System.out.println(Arrays.toString(arr));
    }
    public static void qsort(int[] arr, int low, int hi){
        if(low>=hi){
            return;
        }
            int s = low;
            int e = hi;
            int m = s+(e-s)/2;
            int pivot = arr[m];
            while(s<=e){
                while(arr[s]<pivot){
                    s++;
                    
                }
                while(arr[e]>pivot){
                    e--;

                }
                if(s<=e){
                    int temp = arr[s];
                    arr[s]=arr[m];
                    arr[m]=temp;
                    s++;
                    e--;
                }
            }
            qsort(arr,low,e);
            qsort(arr,s,hi);
        

    }
}
