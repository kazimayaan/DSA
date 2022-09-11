// import java.util.Arrays?;

public class maxin2darray {
// public class searchin2darray {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 32, 34},
            {33, 55, 56},
            {33,44,445},
            {12 , 33, 45544}
        };
        // int target = 445;

       int ans =  search(arr);
    //    System.out.println(arr[ans]);
    
    //    System.out.println(Arrays.toString(ans));
    System.out.println(ans);
    }

    private static int search(int[][] arr) {
        // boolean flag = false;
        int target = arr[0][0];
        for (int row = 0; row < arr.length; row++) {

            for (int j = 0; j < 3; j++) {
                    if(arr[row][j]>target){
                        target = arr[row][j];
                    }
                
            }
            
        }
        return target;
    }
// }/

}
