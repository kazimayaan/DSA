package patterns;

public class pattern6 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            
            
            int cols = row;
            if (row > n) {
                cols = n - (row - n);
            }
            int ns;
            
             ns = n-cols;
           
            
            for (int k = 0; k < ns; k++) {
                System.out.print(" ");
            }
            for (int column = 1; column <= cols; column++) {
                System.out.print("* ");
            }
          
            // we are printing a new line;
            System.out.println();

        }
    }
}
