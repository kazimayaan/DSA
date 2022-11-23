package numbertheory.leetcode;

import java.util.ArrayList;

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
       
        for ( int i = list.size()-1; i> 0 ; i--){
            if(list.get(i)>list.get(i-1)){
                 Collections.swap(list, i, i-1);
                break;
            }
}
        int ans = 0;
        for(int nos: list)  
                    {  
                    ans = ans *10 + nos;
                    }  
        if(ans==n){
            return -1;
        }
        else{
            return ans;
        }
    }
}
