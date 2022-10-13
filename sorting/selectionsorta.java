package sorting;

import java.util.Arrays;

public class selectionsorta {
    public static void main(String[] args) {
        int[] arr = { 1, 23, 4, 5, 3, 77, 9, 7 };
        selections(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selections(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - 1 - i;
            int maxIn = getMaxIndex(arr, 0, last);

            swap(arr, maxIn, last);
        }

    }

    private static void swap(int[] arr, int maxIn, int last) {
        int temp = arr[maxIn];
        arr[maxIn] = arr[last];
        arr[last] = temp;
    }

    private static int getMaxIndex(int[] arr, int i, int last) {
        int maxIn = 0;
        for (int j = 0; j <= last; j++) {
            if (arr[maxIn] < arr[j]) {
                maxIn = j;
            }
        }
        return maxIn;
    }
}
