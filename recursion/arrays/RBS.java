package recursion.arrays;

public class RBS {
    public static void main(String[] args) {
        int[] arr= {5,6,7,8,1,2,3,4};
        int target = 6;
        int index = rbs(arr,target);
        System.out.println(index);
    }

    private static int rbs(int[] arr, int target) {
        int s = 0;
        int e = arr.length-1;
        int mid = s+(e-s)/2;
        while(s<=e){
            if(arr[mid]==target){
                return mid;
            }
            if(arr[s]<arr[mid]){
                if(target>arr[s]){
                    e = mid-1;
                }
                else{
                    s = mid+1;
                }
            }
            if(arr[mid]>arr[s]){
                if(target>arr[s]){
                    e = mid -1;
                }
                else{
                    s = mid+1;
                }
            }
        }
        return 0;
    }
}
