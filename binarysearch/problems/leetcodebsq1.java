package binarysearch.problems;
public class leetcodebsq1 {
    public static void main(String[] args) {
        char[] arr = {'a','b','d','k','m','n'};
        char target = 'z';
        char res = lol(arr,target);
        System.out.println(res);
    }

    private static char lol(char[] arr, char target) {
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int mid = (s+e)/2;
            if(arr[mid]<target){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return arr[s%arr.length];
    }
}
