public class fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonaaci(5));
    }

    private static int fibonaaci(int i) {
        if(i == 0 || i == 1){
            System.out.println(i);
            return i;
        }
        return fibonaaci(i-1) + fibonaaci(i-2);
    
    }
}
