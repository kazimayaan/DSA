package recursionarray;

public class linearsearchrec {
    public static void main(String[] args) {
        
        int[] arr = { 1,2,3,4,5,7,8,9};
        int target = 9;
       int index = lsearch(arr, target, 0);
       System.out.println(index);
    }

    private static int lsearch(int[] arr, int target, int i) {
        if(i == arr.length){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }
        return lsearch(arr,target,++i);

    }
}
