import java.util.Arrays;

public class strictlysorted2darray {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int target = 12;
        int[] sol = search(arr,target);
        System.out.println(Arrays.toString(sol));
    }

    private static int[] search(int[][] arr, int target) {
        int r = arr.length;
        int c = arr[0].length; //being cautiouis

        if(r == 1){

            return bs(arr, r, 0, c-1, target);

        }
        int rowstart = 0;
        int rend = r-1;
        int cmid = c/2;
        // rumn loop till two rows are remaining
        while(rowstart< (rend-1)){
            int mid = rowstart + (rend -rowstart)/2;
            
        }

    }
    // searching in row provided with cols.
    static int[] bs(int[][] matrix,int row, int cols, int cole, int target){
        int mid = cols+(cole-cols)/2;
      
        while(cols<=cole){
            if(matrix[row][mid]==target){
                return new int[] {row,mid}; 

            }
            else if(matrix[row][mid]<target){
                cols = mid+1;
            }
            else{
                cole = mid-1;
            }
        }
        return new int[] {-1,-1};
    }
}
