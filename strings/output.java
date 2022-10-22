package strings;

import java.util.Arrays;

public class output {
    public static void main(String[] args) {
        // function overloading
        // same name of functions but becs of parameter it changes the imple,mentation
        System.out.println(56);
        System.out.println("kazim");
        extracted();
        // out is a variable of type printstream
        // printstream si a class and has methods print and println
        // everything is getting converterd to string then printed
// array is not working ebcvause it is an object
// printinga  random value
// if we want to do pretty print, we can override the method

        
    }

    private static void extracted() {
        System.out.println(Arrays.toString(new int[]{1,23,45}));
    }
}
