import java.util.Arrays;

public class varargs {
    public static void main(String[] args) {
        fun(1,23,4,45,5656,75,7,7,534);

        
    }

    static void fun(int ...v){

        System.out.println(Arrays.toString(v));

    }
}


