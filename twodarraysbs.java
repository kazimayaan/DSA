import java.util.Arrays;

public class twodarraysbs {
    public static void main(String[] args) {
        
        int[][] matrix = {
            {10,20,30,40,50},
            {11,21,31,41,51},
            {12,22,32,42,52},
            {13,23,33,43,53},
            {14,24,34,44,54}
        };
        int target = 33;
        int[] sol =search(matrix, target);
        System.out.println(Arrays.toString(sol));
        
    }
    static int[] search(int[][] matrix, int target){
        int r = 0;
        int c = matrix.length-1;

        while(r <matrix.length && c >=0){

            if(matrix[r][c]==target){
                return new int[] {r,c};
            }
            else if(matrix[r][c]>target){
                c--;
            }
            else if(matrix[r][c]<target){
                r++;
            }
        }
        return new int[] {-1,-1};
    }
}
