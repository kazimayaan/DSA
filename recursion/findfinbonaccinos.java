package recursion;

public class findfinbonaccinos {
    public static void main(String[] args) {
       int n =  fibonacci(6);
       System.out.println(n);
    }

    private static int fibonacci(int i) {
int n = 0;
if(i == 1 || i == 0){
    return i;

}
        


        
        n= fibonacci(i-1)+fibonacci(i-2);

    
        return n;
    }
}
