package recursion;

public class numbersexrecursion {
    public static void main(String[] args) {
    //    print(3) ;
       prinet(1);
    }
    private static void prinet(int i) {
        if(i == 5){
            System.out.println(i);
            return;
        }
            System.out.println(i);
            prinet(i+1);
            // need base condition 
            // infinite erecu is stack overflow
        

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
