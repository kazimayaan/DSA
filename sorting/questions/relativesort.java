package sorting.questions;

import java.util.Arrays;

public class relativesort {
    
    public static void main(String[] args) {
        int[] arr1 = {2,2,4,6,43,6,5,7};
        int[] arr2 = {2,43,5,4};
        int[] sol = relativeSortArray(arr1, arr2);
        System.out.println(Arrays.toString(sol));
        }
        public static int[] relativeSortArray(int[] arr1, int[] arr2) {
            int largest = 0;
            // get the largest element from arr1
            for(int i=0; i<arr1.length; i++) 
                largest = Math.max(arr1[i], largest);
            
            // create an array of size (largest+1) to store frequencies of elements in arr1
            int[] frequencies = new int[largest+1];
            for(int i=0; i<arr1.length; i++) 
                frequencies[arr1[i]]++;
            
            int index = 0;
            for(int i=0;  i<arr2.length;  i++){
                // insert the current element of arr2 till freqeuncy of this element in arr1 becomes 0
                while((frequencies[arr2[i]]--) > 0) 
                
                    arr1[index++] = arr2[i];
            }
            
            // insert the remaining elements of arr1 as per their frequencies  which were not present in arr2
            for(int i=1;  i<frequencies.length;  i++){
                while((frequencies[i]--) > 0) 
                    arr1[index++] = i;
            }
            return arr1;
        }
    
}
