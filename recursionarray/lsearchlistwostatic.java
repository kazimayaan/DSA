package recursionarray;

import java.util.ArrayList;

public class lsearchlistwostatic {
    public static void main(String[] args) {
        
        int[] arr = { 1,2,3,4,5,7,8,9,9,9,9};
        int target = 9;
        ArrayList<Integer> myList = new ArrayList<Integer>();
    ArrayList<Integer>  list = lsearch(arr, target, 0,myList);
       System.out.println(list.toString());
    }


        private static ArrayList<Integer> lsearch(int[] arr, int target, int i, ArrayList<Integer> myList) {
        if(i == arr.length){
            return myList;
        }
        if(arr[i]==target){
            myList.add(i);
        }
        return lsearch(arr,target,++i, myList);

    }
}
