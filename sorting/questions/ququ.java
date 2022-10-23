package sorting.questions;

import java.util.Arrays;

public class ququ {
    public static void main(String[] args) {
        int[] arr = {2,0,3,4,1,3 };

        sortArrayByParityII(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] sortArrayByParityII(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++)
         if (nums[j] % 2 == 0 && i < nums.length) {
             int temp = nums[i];
             nums[i] = nums[j];
             nums[j] = temp;
         i = i+2;
         }
     
     return nums;
 }
}
