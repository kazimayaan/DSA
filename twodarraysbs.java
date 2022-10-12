public class twodarraysbs {
    public static void main(String[] args) {
        
        
        
    }
    static int[] search(int[][] matrix, int target){
        int r = 0;
        int c = matrix.length-1;
        int[] sol = new int[2];

        while(r <matrix.length && c > 0){

            if(matrix[r][c]==target){
                sol[0] = r;
                sol[1] = c;
                return sol;
            }
            else if(matrix[r][c]>target){
                c--;
            }
            else if(matrix[r][c]<target){
                r++;
            }
        }
    }
}
