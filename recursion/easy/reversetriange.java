package recursion.easy;

import java.util.Arrays;

public class reversetriange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr) {
        if(arr.length<1){
            return;
        }
        int[] temp = new int[arr.length-1];
        for(int i = 0; i< arr.length-1; i++){
            int tem = arr[i]+arr[i+1];
            temp[i]=tem;
        }
        reverse(temp);
        System.out.println(Arrays.toString(temp));
    }
}
