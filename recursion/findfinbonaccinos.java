package recursion;

public class findfinbonaccinos {

    public static void main(String[] args) {
       int n =  fibonacci(50);
       System.out.println(n);
    }
    // very inefficient
    // golden ratio of power of n



    private static int fibonacci(int i) {
int n;
if(i == 1 || i == 0){
    return i;

}
        


        
        n= fibonacci(i-1)+fibonacci(i-2);

    
        return n;
    }
}
