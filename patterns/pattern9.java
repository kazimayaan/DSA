package patterns;

public class pattern9 {
   
  

    public static void main(String[] args) {
        pattern(5);
        // pattern17(5);
    }

    static void pattern(int n) {
     
        for (int row = 1; row <= 2*n; row++) {
            
            
            
           int cols = row;
            if(row>n){
                cols= 2*n -row;
            }
            
            
            
           
            
            for (int k = 0; k < n-cols; k++) {
                System.out.print("  ");
            }

            for (int column = cols; column >=1 ;  column--) {

                System.out.print(column + " ");
            }
            for (int column = 2; column <= row ;  column++) {

                System.out.print(column+ " ");
            }
          
            // we are printing a new line;
            System.out.println();

        }
    }
    static void pattern17(int n) {
        for (int row = 1; row <= 2 * n; row++) {

            int c = row > n ? 2 * n - row: row;

            for (int space = 0; space < n-c; space++) {
                System.out.print("  ");
            }

            for (int col = c; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }


}


