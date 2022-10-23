package patterns;

public class pattern6 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            if(row<n){
                int ns = 1;
            }
            else{

            }
        

            int cols = row;
            if (row > n) {
                cols = n - (row - n);
            }
            for (int k = 0; k < ns; k++) {
                System.out.println(" ");
            }
            for (int column = 1; column <= cols; column++) {
                System.out.print("*");
            }
       
            // we are printing a new line;
            System.out.println();

        }
    }
}
