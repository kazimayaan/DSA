package sorting.cyclesort.cyclesortquestions;

public class medfinddupnukm {
    



    public static void main(String[] args) {
        int[] arr ={1,2,2};
      int sol =  findDuplicate(arr);
System.out.println(sol);
    }

    public static int findDuplicate(int[] nums) {
        
     
        
        
        int n = nums.length;
        int i = 0;
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
            if(nums[j]!=j+1){
                return nums[j];
            }
        }
        
        return n;
    }
    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
   
    }
}
