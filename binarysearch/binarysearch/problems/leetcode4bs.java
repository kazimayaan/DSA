package binarysearch.problems;
import java.util.Arrays;



public class leetcode4bs{


    public static void main(String[] args) {
        int[] arr = {1,22,22,22,22,22,33,44,555,555,666};
        int target = 22;
        int[] ans = sol(arr,target);
        int k = search(arr, target, true);
        System.out.println(k);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] sol(int[] arr, int target) {
        boolean finds = true;
        int[] res = {-1,1};

        int a = search(arr,target,finds);
        int b = search(arr,target,false);
        
        res[0]=a;
        res[1]=b;


        return res;
    }

    private static int search(int[] arr, int target, boolean finds) {
int ans =-1;
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int mid = s+ (e-s)/2;
            if(target<arr[mid]){
                e = mid-1;

            }
            else if(target>arr[mid]){
                s= mid+1;
            }
            else{

                if(finds){

                    ans=mid;
       
                       e=mid-1;
                }
                else{
                    ans=mid;
                    s=mid+1;
                }
                
            }
        }
        return ans;
    }




}