package numbertheory.leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class nextgreatelement {
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(nextGreaterElement(n));

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
       
        for ( int i = 0; i<list.size()-1 ; i++){
            int y = list.get(i);
            int z = list.get(i+1);

            if(list.get(i)>list.get(i+1)){
                 Collections.swap(list, i, i+1);
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
