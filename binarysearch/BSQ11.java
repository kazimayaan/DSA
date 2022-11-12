public class BSQ11 {
    public static void main(String[] args) {
        //subarray question
        //minimum no iof partitions we can make : is 1;
        // the maximum number of partitions that can be: it is m;
        // what will be ans in case 1
        //case 1 ans is sum of the array itself
        // case 2 answer is the manimum of the array
        //max is case1 
        //min is case2 
// min calue is max value in array
//max is sum of values all in array
//possible answer can have maximum
// we get lower and upper limit, start = min and end = sum of all, mid = start+end / 2
// try to see if you can split the array with mid as the maximum 21
// the answe exists definitely
// lets code
int[] arr = {1,2,3,4,5,6,7,8};
int m = 2;

int sol = splitarray(m , arr);

    }

    private static int splitarray(int m, int[] arr) {
      int  start = 0;
      int  end = 0;

        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start, arr[i]);
            end = end+ arr[i];
        }
        // binary search
        while(start<end){
            // try fot mid as pot ans
            int mid = (start + end )/2;
            int sum = 0;
            int pieces = 1;
            for (int num : arr) {
                if(sum+num>mid){
                    sum = num;
                    pieces ++;
                }
                else{
                    sum = sum + num;
                }
                if(pieces>m){
                    start = mid + 1;

                }
                else{
                    end = mid;
                }
            }
        }
        return end;
    }
}
