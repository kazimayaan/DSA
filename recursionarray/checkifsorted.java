package recursionarray;

public class checkifsorted {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5,0,8,9};
        System.out.println(sorted(arr,0,arr.length-1));
    }

    private static boolean sorted(int[] arr, int ind, int last) {
        if(ind==last){

            return true ;
        }
        if(arr[ind]>arr[ind+1]){
            return false;
        }
        return sorted(arr, ++ind, last);
    }
}
