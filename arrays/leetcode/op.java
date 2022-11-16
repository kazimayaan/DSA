package leetcode;

import java.util.Arrays;

public class op {
    public static void main(String[] args) {
        int[] nums = {1,2,0,4,0,0,3};
        int[] arr= applyOperations(nums);
        System.out.println(Arrays.toString(arr));


    }
    public static int[] applyOperations(int[] nums) {
        for(int i =0; i < nums.length-1; i++){
           if (nums[i]==nums[i+1]){
               nums[i]=nums[i]*2;
               nums[i+1]=0;
           }
        }
        int z = 0;
        
        for (int i =0; i< nums.length;i++){
            if(nums[i]!=0){
                nums[z]=nums[i];

                z++;
            }
        }
        for(int i = z; i < nums.length; i++){
            nums[i]=0;
        }
        return nums;
    }
}
