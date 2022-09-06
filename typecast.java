import java.util.Scanner;

public class typecast {
    public static void main(String[] args) {
        Scanner kkk = new Scanner(System.in);
        System.out.println("enter a float ");
        float fa = kkk.nextFloat();

        System.out.println("the value is " + fa);

        int fi = (int)(fa);
        System.out.println(fi);

        int a = 257;
        byte b = (byte)(a);
        System.out.println(b);

        byte aa = 30;
        byte bb = 100;
        byte c= 99;
        int l= (aa*bb)/c;
        System.out.println(l);
        //java is promoting each byte to integer.


        int number= 'A';
        System.out.println(number);
        

        //promotion rules:
        //byte,short,char=>promoted to integer, 
        //if any of the operator is going to integer=>int, float=>float, double=>double.
        
        byte m = 12;
        short n = 1;
        char v = 'A';
        int x = 2223;
        float z = 222.33f;
        double k = 33.222222d;
        double res= ((m*x)+(v-n)-(v-k));
        System.out.println((m*x) + " " +  (n+z ) + " " + (v -k));
//                       gives int       gives float      gives double.
        System.out.println(res);


    }
}
//to make the typecast, the destination type should be greater than the source type.,and they should be similar.
//to make forced typecast, need to do narrowing/typecasting, explicitly compressign.