package patterns;

public class pattern8 {
  

    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        int cols=1;
        for (int row = 1; row <= n ; row++) {
            
            
            
            if(row>1){
                cols= cols+2;
            }
            
            
            int ns;
            
             ns = n-row;
           
            
            for (int k = 0; k < ns; k++) {
                System.out.print("  ");
            }

            for (int column = row; column >=1 ;  column--) {

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
