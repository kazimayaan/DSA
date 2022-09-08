import java.util.Arrays;
import java.util.Scanner;

public class methods3 {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        swap(a, b);
        System.out.println("a is " + a);
        System.out.println("b is " + b);
        int[] arr = {1,2,3,4,4,56,67,8};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b= temp;
        System.out.println(a+" "+b);
        System.out.println("a is " + a);
        System.out.println("b is " + b);
    }
    static void change(int[] nums){
        nums[0]=99;
    }
}
