package recursion;

public class findfinbonaccinos {

    public static void main(String[] args) {
       int n =  fibonacci(6);
       System.out.println(n);
    }
    c

    private static int fibonacci(int i) {
int n;
if(i == 1 || i == 0){
    return i;

}
        


        
        n= fibonacci(i-1)+fibonacci(i-2);

    
        return n;
    }
}
