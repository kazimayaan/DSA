package numbertheory;

public class sqrt {
    public static void main(String[] args) {
        // well use binary search
        int x = 10;
        int y = mySqrt(x);
        System.out.println(y);
    }
    public static int mySqrt(int x) {
        if(x == 1){
            return 1;
        }
        long ans=0;
        long s = 0;
        long e = x;
        while(s<=e){
            long mid = s+(e-s)/2;
            if(mid *mid == x){
                return (int)mid;
            }
            else if (mid*mid < x){
                s = mid+1;
                ans=mid;
            }
            else if (mid * mid > x){
                e = mid-1;
            }
            
        }
        return (int)ans;
    }
}
