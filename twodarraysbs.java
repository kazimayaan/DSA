public class twodarraysbs {
    public static void main(String[] args) {
        
        
        
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
