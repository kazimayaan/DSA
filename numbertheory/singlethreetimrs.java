package numbertheory;

public class singlethreetimrs {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,4,1,2,3,4,4};
        System.out.println(dupl(arr));
        int lol = 0;
       
        
    }


    private static int dupl(int[] arr) {
        
        int ones = 0,twos = 0;
        for(int e:arr){
            ones = ((ones^e) & (~twos));  
            twos = ((twos^e) & (~ones));
            
        }
        return ones;
    }

        
    
}
