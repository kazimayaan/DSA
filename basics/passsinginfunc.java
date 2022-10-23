import java.util.Arrays;

public class passsinginfunc {
    public static void main(String[] args) {

        int[] num= new int[5];
        System.out.println(Arrays.toString(num));
        fun(num);
        System.out.println(Arrays.toString(num));
        
    }
    static void fun(int[] arr){
        arr[1] = 1111;
    }
}
