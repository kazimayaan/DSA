public class rotatedsorted {
    // rotated array{+ } without any duplicate numbers

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,0,1,2,3};
        int pivot = findPivot(arr);
        int target = 1;
        if(pivot==-1){
           
            int sol = binarysearch(target,arr);
            
        }
        System.out.println(arr[pivot]);
        System.out.println("enter the target  it is 5");
        int sol = Rbinarysearch(arr,target);
        System.out.println(arr[sol]);
        System.out.println(sol);
    }

    private static int binarysearch(int target, int[] arr) {
        int n = arr.length;
        int s = 0;
        int e  = n-1;
        while(s<=e){
            int mid = s+ (e-s)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                s=mid+1;
            }
            else{
                e = mid-1;
            }
        }
        return -1;
    }

    private static int Rbinarysearch(int[] arr, int target) {

        int p = findPivot(arr);
        int n = arr.length;
        int s = 0;
        int e  = p-1;
        while(s<=e){
            int mid = s+ (e-s)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                s=mid+1;
            }
            else{
                e = mid-1;
            }
        }
        s= p;
        e=n-1;
        while(s<=e){
            int mid = s+ (e-s)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                s=mid+1;
            }
            else{
                e = mid-1;
            }
        }
        return -1;
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
