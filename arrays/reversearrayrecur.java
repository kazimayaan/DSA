import java.util.Arrays;

public class reversearrayrecur{
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7};
       int[] res = reverse(arr, 0 , arr.length-1);
        System.out.println(Arrays.toString(res));
    }

    private static int[] reverse(int[] arr, int i, int length) {
        if(i == length || i > length){
            return arr;
        }
        int temp  = arr[i];
        arr[i] = arr[length];
        arr[length] = temp;
        return reverse(arr, ++i, --length);
    }

   
}