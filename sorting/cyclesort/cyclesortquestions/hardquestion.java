package sorting.cyclesort.cyclesortquestions;

public class hardquestion {
    // first missing Positive

    public static void main(String[] args) {
        


        int[] arr = {1,2,3,9};
        

    }
    public static int firstMissingPositive(int[] nums) {
           
        int n = nums.length;
        int i = 0;
        while(i<nums.length){
            int correct = nums[i]-1;
           
            if(nums[i]<=nums.length && nums[i]>0 && nums[i]!= nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
         for(int j = 0; j < nums.length; j++){
            if(nums[j]!=j+1){
                return j+1;
            }
        }
        return n+1;
        
    }
     private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
