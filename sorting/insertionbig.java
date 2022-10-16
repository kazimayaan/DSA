package sorting;

import java.util.Arrays;

public class insertionbig {
  
    public static void main(String[] args) {
        
         int[] arr= {11,1,3,4,2,77,65,44,45,6};

         insertionsort(arr);
         System.out.println(Arrays.toString(arr));

    }

    private static void insertionsort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {

            for (int j = i+1; j >0; j--) {
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


