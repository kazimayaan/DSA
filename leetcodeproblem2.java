import java.util.Arrays;

import javax.sound.sampled.SourceDataLine;

public class leetcodeproblem2 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 4},
                {4,1,1,91},
                {4,5,6}
        };


        for (int[] is : arr) {
            System.out.println(Arrays.toString(is));
        }

        int[] sum = getsumof(arr);
        int res = maxx(sum);
        System.out.println("the maximum wealth is "+ res);
    }

    private static int maxx(int[] sum) {
        int n=sum[0];
        for (int i = 0; i < sum.length; i++) {
            if(sum[i]>n){
                n= sum[i];
            }
        }
        // System.out.println("");
        return n;
    }
    

    private static int[] getsumof(int[][] arr) {
        // return null;/
        int[] result = new int[arr.length];
        // int k =0;
        for(int person=0;person<arr.length;person++){
           int sum=0;
            for(int acc = 0; acc < arr[person].length; acc++){
                sum= sum + arr[person][acc];
            }
            result[person] = sum;
            
            
        }
        return result;
    }
}
