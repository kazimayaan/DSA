import java.util.Arrays;
import java.util.Scanner;

public class multidimensionalrarrays {
    public static void main(String[] args) {
        int[][] mul = new int[3][3];
        // rows is mandatory
            int[][] mul2d = {
                {1,2,3},
                {4,5,6},
                {7,8,9, 10}
            };
            // System.out.println(Arrays.toString(mul2d));
Scanner in = new Scanner(System.in);

            // input
            for (int i = 0; i < mul.length; i++) {
                for (int j = 0;j< mul[i].length; j++) {
                    mul[i][j] = in.nextInt();
                }
            }

            for (int[] is : mul) {
                System.out.println(Arrays.toString(is));
            }

    }
}
