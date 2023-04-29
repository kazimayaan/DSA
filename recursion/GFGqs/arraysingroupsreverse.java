package recursion.GFGqs;

import java.util.ArrayList;

import recursion.easy.reverseanumber;

public class arraysingroupsreverse {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        int k = 3;
        int n = 5;
        reverseInGroups(arr, n , k);
    }
    static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        // for(int i = k-1; i>=0; i--){
        //     System.out.print(arr.get(i) + " ");
        // }
        // for(int i = n-1; i>=k; i--){
        //     System.out.print(arr.get(i)+ " ");
        // }
        for(int i = 0; i < n; i++){
            
            System.out.print(arr.get(i) + " ");
        }
    }
}
