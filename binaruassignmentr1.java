import java.util.Arrays;

public class binaruassignmentr1 {

    public static void main(String[] args) {
        int[] que = {1,2,3,4,5,7,8,9,10};
        int target = 9;
        int[] sol = twoSum(que,target);
        System.out.println(Arrays.toString(sol));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int[] sol = new int[2];
        
        for(int i = 0; i < numbers.length; i++){
            int s = i+1;
        int e = numbers.length-1;
        
            
        
        while(s<=e){
            int mid = s+ (e-s)/2;
            if(numbers[i]+numbers[mid]==target){
                sol[0]=i+1;
                sol[1]=mid+1;
                return sol;
                
            }
           else if(numbers[i]+numbers[mid]<target){
                  s=mid+1;
            }
            else{
                
              
                e=mid-1;
                
                
               
                        }
                    }
                }
                
          return sol;
        
    }
}
