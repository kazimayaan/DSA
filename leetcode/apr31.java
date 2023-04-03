package leetcode;

import java.util.Arrays;

public class apr31 {
    public static void main(String[] args) {
        int[] people ={1,2,2,3};
		System.out.println(numRescueBoats(people, 3));
    }
    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        // int i = 0;
        int counter = 0;
        int s = 0; 
        int e = people.length-1;
        while(s<=e){
            int sum = people[s]+people[e];
            if(sum<=limit){
                s++;
                e--;
                counter++;
            }
            else if(sum > limit){
                e--;
                counter++;
            }
        }
        return counter;
    }
}
