package recursion.arrays;

import java.util.ArrayList;

public class lsearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,8,9,8};
        int target = 8;
        ArrayList<Integer> list = lists(arr,target,0);
        System.out.println(list);
    }

    private static ArrayList<Integer> lists(int[] arr, int target, int index) {
        if(index==arr.length-1){
            
        }
        ArrayList<Integer> list = new ArrayList<>();

        if(arr[index]==target){
            list.add(index);
        }
        return lists(arr, target, index+1);
    }
}
