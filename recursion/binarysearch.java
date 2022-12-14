package recursion;

public class binarysearch {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,77,88};
        int target = 88;
        int index = binarysearch(arr,target, 0 , arr.length-1);
        if(index==-1){
            System.out.println("not found sorry, enter again");
        }
        System.out.println(index);
    }

    private static int binarysearch(int[] arr, int target, int i, int j) {
        int e = j;
        int s = i;
        if(s>e){
            return -1;
        }
        int mid = s + (e-s)/2;

        if(arr[mid]==target){
            return mid;

        }
        else if(arr[mid]<target){
                return binarysearch(arr, target, mid +1, e);
        } 
        else{
            return binarysearch(arr, target, s, mid-1);
        }
     }

}
