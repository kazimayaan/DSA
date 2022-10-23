package patterns;

public class pattern9 {
   
  

    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
     
        for (int row = 1; row <= 2*n; row++) {
            
            
            
           int cols = row;
            if(row>n){
                cols= n - (row - n);
            }
            
            
            int ns;
            
             ns = n-cols;
           
            
            for (int k = 0; k < ns; k++) {
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


}


