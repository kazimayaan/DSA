package leetcode;

import java.util.Arrays;

public class apr31 {
    public static void main(String[] args) {
        int[] people ={1,2,2,3};
		System.out.println(numRescueBoats(people, 3));
    }
    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0;
        int counter = 0;
        while(i < people.length){
            int sum = 0;
            sum = people[i];
            i++;
            if(sum==limit){
                counter+=1;
            }
            else{
                while(i<people.length && sum < limit){
                    sum = sum + people[i];
                    i++;
                }
                counter++;
            }
        }
        return counter;
    }
}
