package recursionarray;

public class rbs {
    public static void main(String[] args) {
        int[] arr = {4,5,7,8,1,2,3};
        int target = 1;
       int index = rbs(arr, target, 0, arr.length-1);
       System.out.println(index);
    }


        private static int rbs(int[] arr, int target, int l, int h) {
            if(l>h){
                return -1;
            }
            int mid = l + (h-l)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[l]<=arr[mid]){
                if(target>=arr[l] && target<=arr[mid]){

                    return rbs(arr,target,l,mid-1);
                }else{

                    return rbs(arr,target,mid+1,h);
                }
            }
            if(target >= arr[mid]&&target<=arr[h]){
                return rbs(arr,target,mid+1,h);

            }
       else{
                return rbs(arr,target,l,mid-1);
            }
        }
    }
