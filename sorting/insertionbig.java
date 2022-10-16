package sorting;

import java.util.Arrays;

public class insertionbig {
  
    public static void main(String[] args) {
        
         int[] arr= {11,1,3,4,2,77,65,44,45,6};

         insertionjsort(arr);
         System.out.println(Arrays.toString(arr));

    }

    private static void insertionjsort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {

            for (int j = arr.length-i-1; j <arr.length; j++) {
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp; 
                    
                }
                else{
                    break;
                }
            }
            
        }
    }
    
}


