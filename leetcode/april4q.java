package leetcode;

import java.util.HashSet;
import java.util.Set;

class april4q{
    public static void main(String[] args) {
        int sol = partitionString("sssss");
        System.out.println(sol);s
    }
    public static int partitionString(String s) {
        Set<Character> set = new HashSet<Character>();
        int partition = 0;
        for(int i = 0 ; i < s.length(); i++){
            if(set.contains(s.charAt(i))){
                set.clear();
                partition++;
                set.add(s.charAt(i));
            }
            else{
                set.add(s.charAt(i));

            }
        }
        return partition+1;
    }
}