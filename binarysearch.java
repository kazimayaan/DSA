import java.util.Scanner;

import javax.sound.midi.MidiFileFormat;

public class binarysearch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("enter the target elemrnt");
        int target = in.nextInt();
        int i = bs(arr,target)+1;
        if(i==0){
            System.out.println("elemnt not found");
        }
        else{

            System.out.println("elemnt found at " + i+"th position");
        }
    }

    private static int bs(int[] arr, int target) {
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int mid = (s+e)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(target>arr[mid]){
                s=mid+1;

            }
            else{
                e=mid-1;
            }
        }
        return -1;
    }
    
}
