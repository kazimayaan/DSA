package sorting.cyclesort.cyclesortquestions;

public class cycmiss1 {
    public static void main(String[] args) {
        int[] arr ={1,2,0};
      int sol =  missingNumber(arr);
System.out.println(sol);

    }
            public static int missingNumber(int[] nums) {
                
                
                int n = nums.length;
                int i = 0;
                while(i<nums.length){
                    int correct = nums[i];
                   
                    if(nums[i]<nums.length && nums[i]!= nums[correct]){
                        swap(nums,correct, i);
                    }
                    else{
                        i++;
                    }
                }
                
                for(int j = 0; j < nums.length; j++){
                    if(nums[j]!=j){
                        return j;
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
