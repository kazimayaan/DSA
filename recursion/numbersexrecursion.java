package recursion;

public class numbersexrecursion {
    public static void main(String[] args) {
       print(3) ;
    }
    private static void print(int i) {
 
System.out.println(i);
i++;
        if(i < 6){
            print(i);
        }
        else{
            return;
        }
    }
}
