package recursion;

public class findfinbonaccinos {
    public static void main(String[] args) {
       int n =  fibonacci(5);
    }

    private static int fibonacci(int i) {
int n = 0;
if(i == 1 || i == 0){
    return i;
}
        while(i>1){

        
        n= fibonacci(i-1)-fibonacci(i-2);

    }
        return n;
    }
}
