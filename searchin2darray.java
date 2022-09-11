import java.util.Arrays;

public class searchin2darray {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 32, 34},
            {33, 55, 56},
            {33,44,445},
            {12 , 33, 455}
        };
        int target = 455;

       int[] ans =  search(arr,target);
       System.out.println(Arrays.toString(ans));
    }

    private static int[] search(int[][] arr, int target) {
        // boolean flag = false;
        for (int row = 0; row < arr.length; row++) {

            for (int j = 0; j < arr[row].length; j++) {
                    if(arr[row][j]==target){
                        return new int[] {row,j};
                    }
                
            }
            
        }
        return new int[] {-1,-1};
    }
}
