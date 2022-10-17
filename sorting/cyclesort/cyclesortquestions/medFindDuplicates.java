package sorting.cyclesort.cyclesortquestions;

import java.util.ArrayList;
import java.util.List;

public class medFindDuplicates {
    // google question
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,5,8,8};
        List<Integer> sol =     findDuplicates(arr);
        System.out.println(sol);

        
    }
    public static List<Integer> findDuplicates(int[] nums) {
        
      
        int i = 0;
        ArrayList<Integer> arrli=new ArrayList<>();
        while(i<nums.length){
            int correct = nums[i]-1;
           
            if( nums[i]!= nums[correct]){
                swap(nums,correct, i);
            }
            else{
                i++;
            }
        }
        
        for(int j = 0; j < nums.length; j++){
            int correct = j+1;
            if(nums[j]!=correct){    
                arrli.add(nums[j]); 
            }
        }
        
        return arrli;
    }
    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
