package sorting;

import java.util.Arrays;

public class selectionsortwminiubd {
    public static void main(String[] args) {
        int[] arr = { 1, 23, 4, 5, 3, 77, 9, 7 };
        selections(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selections(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int first = i;
            int minIn = getMinIndex(arr, i, arr.length-1);

            swap(arr, minIn, first );
        }

    }

    private static void swap(int[] arr, int maxIn, int last) {
        int temp = arr[maxIn];
        arr[maxIn] = arr[last];
        arr[last] = temp;
    }

    private static int getMinIndex(int[] arr, int i, int last) {
        int minIn = last;
        for (int j = i; j <= last; j++) {
            if (arr[minIn] > arr[j]) {
                minIn = j;
            }
        }
        return minIn;
    }
}
