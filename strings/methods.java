package strings;

import java.util.Arrays;

public class methods {
    public static void main(String[] args) {
        String name = "Kazim Ayaan P S";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.toUpperCase());
       int n =  name.length();
       System.out.println(n);
       System.out.println(name.indexOf('a'));
       System.out.println(name.isEmpty());
       System.out.println(name.lastIndexOf('a'));
      String k =  "                 kazim             ";
        System.out.println(k.strip());
        System.out.println(Arrays.toString(name.split(" ")));
        
    }
}
