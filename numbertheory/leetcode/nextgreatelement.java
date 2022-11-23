package numbertheory.leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class nextgreatelement {
    public static void main(String[] args) {
        int n =230241;
        // 13234321
        System.out.println(nextGreaterElement(12));

    }
    public static int nextGreaterElement(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();  
        int x = n;
        int digits = 0;
        while(x>0){
            list.add(x%10);
            x/=10;
            digits++;
        }
        int minin = 0;
       
        for ( int i = 0; i<list.size()-1 ; i++){
            int y = list.get(i);
            int z = list.get(i+1);
            if(y<z){
                if(list.get(minin)>y){
                    minin = i;
                }
            }
            if(list.get(i)>list.get(i+1)){
                 Collections.swap(list, i, minin);
                break;
            }
}
        int ans = 0;
      for(int j = list.size()-1; j>=0;j--)
                    {  
                    ans = ans *10 + list.get(j);
                    }  
        if(ans==n){
            return -1;
        }
        else{
            return ans;
        }
    }
}
