import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[ ] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("the element in array is " + arr[i]);
        }

        for(int num : arr){
            System.out.println(num);
        }
        System.out.println(Arrays.toString(arr));


// 
        // Array of objects

        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i]= in.next();
        }
        for(String a : str){
            System.out.println(a);
        }

        in.close();
        System.out.println(Arrays.toString(str));

        // modify//

        str[2 ] = "kazimmm";
        System.out.println(Arrays.toString(str));


        
    }
}
