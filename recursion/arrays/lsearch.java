package recursion.arrays;

import java.util.ArrayList;

public class lsearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,8,9,8};
        int target = 8;
        ArrayList<Integer> list = lists(arr,target,0);
        System.out.println(list);
        ArrayList<Integer> lists = lists(arr,target,0);
        System.out.println(lists);
    }

    private static ArrayList<Integer> lists(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if(index==arr.length-1){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ans =   lists(arr, target, index+1);
        list.addAll(ans);
        return list;
    }
}
