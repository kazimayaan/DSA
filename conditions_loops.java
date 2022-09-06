import java.util.Scanner;

// import javax.lang.model.util.ElementScanner14;
public class conditions_loops {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the salary");
        int sal = in.nextInt();
        int res= 10;
        if(sal>=1000){
            res= sal+100; 
        }
        else if(sal>500){
           res = sal+50;
        }
        else{
            res=sal+10;
        }
        System.out.println("the resulting salary after bonus is " +res);
        in.close();

    }
}
