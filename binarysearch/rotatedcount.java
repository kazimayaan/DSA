public class rotatedcount {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,9,0,1,2,3};
        // int[] arr = {0,1,2,3,4,5,6,7,8,9};

        int pivot = findPivot(arr);
        int sol;
        if(pivot == arr.length-1){
              sol = 0;
        }
        else{
            sol = pivot+1;
        } 
System.out.println(sol);
        
    }

    private static int findPivot(int[] arr) {
        int n = arr.length;
        int s = 0;
        int e = n-1;
        while(s<=e){
           int mid = s+(e-s)/2;
           if(mid<n && arr[mid]>arr[mid+1]){
               return mid;

           }
           else if(mid>s && arr[mid]<arr[mid-1]){
               return mid-1;
           }
           else if (arr[s]>arr[mid]){
               e = mid-1;
           }
           else if(arr[s]<arr[mid]){
               s = mid+1;
           }

        }
        return -1;
    }
}
