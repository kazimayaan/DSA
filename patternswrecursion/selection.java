package patternswrecursion;

public class selection {
    public static void main(String[] args) {
        int[] arr = {12,11,13,17,99,100};
        selection(arr, arr.length-1, 0, 0);
    }

    private static void selection(int[] arr, int i, int j, int k) {
      if(i == 0){
        return;
      }
      if()
    }
    private static void swap(int a, int b, int[] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b]= temp;
    }
}
