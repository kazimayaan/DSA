package sorting.cyclesort.cyclesortquestions;

public class setmismatch {
    public static void main(String[] args) {
        int[] arr ={1,2,2};
        int[] sol =  findErrorNums(arr);
for (int i = 0; i < sol.length; i++) {
      System.out.println(sol[i]);
}
    }
    public static int[] findErrorNums(int[] nums) {
        int i = 0;
        int[] arr = new int[2];
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
               
                arr[0]=  nums[j];
                arr[1]=  j+1;
            }
        }
        
        return arr;
    }
    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
   
    }
}
