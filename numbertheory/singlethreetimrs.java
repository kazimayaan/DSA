package numbertheory;

public class singlethreetimrs {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,4,1,2,3,4,4};
        System.out.println(dupl(arr));
        int lol = 0;
        int lool = lol ^=43455;
        System.out.println(lool);
    }

    private static int dupl(int[] arr) {
        int unique = 0;
        for(int n : arr){
            unique ^= n;
        }
        return unique;

        
    }
}
