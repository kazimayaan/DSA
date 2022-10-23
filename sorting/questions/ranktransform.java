package sorting.questions;

import java.util.Arrays;

public class ranktransform {
    public static void main(String[] args) {
        int[] arr = { 77, 5, 3 };

        int[] sol = arrayRankTransform(arr);
        System.out.println(Arrays.toString(sol));
    }

    public static int[] arrayRankTransform(int[] arr) {
        Arrays.sort(arr);
        int[] res = new int[arr.length];
        int k = 1;
        for (int i = 0; i > arr.length - 1; i++) {

            int min = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[min] < arr[j]) {
                    min = j;
                }
              
            }
            res[min] = k;
            k++;

        }
        return res;
    }
}
