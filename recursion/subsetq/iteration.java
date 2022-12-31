package recursion.subsetq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class iteration {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2};
        System.out.println(hd(arr));
        List<List<Integer>> ans = h(arr);
        for(List<Integer> list : ans){
            System.out.println(list);
        } 

    }
    static List<List<Integer>> h(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
            outer.add(new ArrayList<>());
        for ( int num : arr){
            int n = outer.size();
            for(int i = 0; i < n; i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);

            }
        }



        return outer;
    }
    static List<List<Integer>> hd(int[] arr){
        Arrays.sort(arr);
        
        List<List<Integer>> outer = new ArrayList<>();
            outer.add(new ArrayList<>());
            int start = 0;
            int end = 0;
            for ( int f = 0; f<arr.length; f++){
            start = 0;
            if(f>0 && arr[f] == arr[f-1]){
               start = end+1;
            }
            
            end = outer.size()-1;
            int n = outer.size();
            for(int i = start; i < n; i++){

                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(arr[f]);
                outer.add(internal);

            }
        }



        return outer;
    }
}
