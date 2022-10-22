package strings;

import java.util.ArrayList;

public class operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        // characters : converts into ascii values and converts it adds
        System.out.println("a"+ "b");
        // with string it is ponly concatenating
        System.out.println('a'+3);
        System.out.println('A'+1);
        System.out.println("a"+1);
        // string witha number its conmcatenation
        // note when an integer is concatenated 
        // integer is comverted to Integer and will call toString()
        // same as after few steps ("a"+ "1");
        System.out.println("Kunal" + new ArrayList<>());
        System.out.println("kazim " + new Integer(3));
        // marke for removalo\

        // + used only with primitives and objects, only condition is at least one should be string
        // the result will be a string
    }
}
