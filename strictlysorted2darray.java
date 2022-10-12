import java.util.Arrays;

public class strictlysorted2darray {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int target = 12;
        int[] sol = search(arr,target);
        System.out.println(Arrays.toString(sol));
    }

    private static int[] search(int[][] arr, int target) {
        return null;
    }
}
