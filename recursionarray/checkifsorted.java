package recursionarray;

public class checkifsorted {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5,7,8,9};
        System.out.println(sorted(arr,0));
    }

    private static boolean sorted(int[] arr, int ind) {
        if(ind==arr.length-1){

            return true ;
        }
        if(arr[ind]>arr[ind+1]){
            return false;
        }
        return sorted(arr, ++ind);
    }
}
