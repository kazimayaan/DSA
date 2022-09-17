public class binaryfloor {
    //cielimg of a number: 
    //sorted array: use binary search
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,10,66,76,86,92};
        int target = 85;
       int index =  floor(arr,target);
       System.out.println(arr[index]);
        
    }

    private static int floor(int[] arr, int target) {

        int s = 0;
        int e = arr.length -1;
       while(s<=e){
        int mid = (s+e)/2;
        if(arr[mid]==target){
        return mid;

        }
        else if(arr[mid]<target){
            s= mid+1;

        }
        else{
           
           
            e=mid-1;
        }

       }
       return e;
    }
   
}

