package patterns;

public class pattern5 {

    public static void main(String[] args) {
        pattern(7);
        // learning in public
        // patterns are important because it enhances your thoiught process
        // pattern questions no one asks much
        // helps imporve skills

        // few steps we need to take
        // loops prerequisites

        // 1, run the outer for loop the number of times you have the lines
        // notice the rows and it becomes no of lines = no of rows = no of times outer
        // loop will run
        // step 2 how many columns are there with each row, or types of elements in the
        // pattern
        // step three check what do yoy need to print
        // only three steps

    }

    static void pattern(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int cols = row;
            if (row > n) {
                cols = n - (row - n);
            }
            for (int column = 1; column <= cols; column++) {
                System.out.print("* ");

            }
            // we are printing a new line;
            System.out.println();

        }
    }
}
