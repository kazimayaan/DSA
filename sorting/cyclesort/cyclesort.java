package sorting.cyclesort;

import java.util.Arrays;

public class cyclesort {
    public static void main(String[] args) {
        // when given numbers from range 1 to N => use cyclic sort
        // 1 to N is cyclic sort
        // 
        // we need only n comparisons in cyclic sort
        // /very veyr very very // important 
        int[] arr = {8,7,6,5,4,3,2,1};
        cyclesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void cyclesort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            
        }
    }
}
