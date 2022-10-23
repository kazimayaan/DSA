// import java.rmi.server.SocketSecurityException;
import java.util.Scanner;
public class temperature {
    public static void main(String[] args) {
        System.out.println("welcome to celcius to farenheit converter");
        // SocketSecurityException
        System.out.println("enter temp in celcius");
        Scanner in = new Scanner(System.in);
        float tempC= in.nextFloat();
        float tempF= (tempC* 9/5) + 32;
        System.out.println("the temperature in farenheit is " + tempF);
        in.close();
    }
}
