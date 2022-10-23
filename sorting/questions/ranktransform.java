package sorting.questions;

import java.util.Arrays;

public class ranktransform {
    public static void main(String[] args) {
        int[] arr = { 77, 3, 3 };
        int[] ss = {40,10,20,30};
      Arrays.sort(ss);
        int[] sol = arrayRankTransform(arr);
        System.out.println(Arrays.toString(sol));
    }
    // use hashmap

  
        public static int[] arrayRankTransform(int[] arr) {
       
            int[] res = new int[arr.length];
            for(int i = 0; i < arr.length; i++){
                
                res[i]= arr[i];
            }
            Arrays.sort(res);
            int[] sol = new int[arr.length];
            int val = 1;
            for(int j = 0; j < arr.length; j++){
                int lol = res[j];
                for(int k = 0; k < arr.length; k++){
                    if(k>0 && arr[k]==arr[k-1] ){
                        sol[k]=val;
                    }
                    if(arr[k]==lol){
                        sol[k]=val;
                        val++;
                    }
                }
            }
            return sol;
        }
}
