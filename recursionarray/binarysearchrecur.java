package recursionarray;

public class binarysearchrecur {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5,7,8,9};
        int target = 9;
       int index = bs(arr, target, 0, arr.length-1);
       System.out.println(index);
    }

    private static int bs(int[] arr, int target, int l, int h) {
        if(h<l){
            return -1;
        }
        int mid = l + (h-l)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]<target){
            return bs(arr,target,mid+1,h);
        }
   else{
            return bs(arr,target,l,mid-1);
        }
    }
}
