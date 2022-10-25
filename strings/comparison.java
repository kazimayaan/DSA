package strings;

public class comparison {
    public static void main(String[] args) {
        String a = "kazim";
        String b = "kazim";

        System.out.println(a == b);
        // == method : comparator
        // == checks both values and reference variabkles to same object
        // because it results true, the red var a , b are pointing to same object kazim;
        // how to create a new different hnew objectsl
        String c = new String("kazim");
        System.out.println(b == c);
        // values are same, but the object is diff so faklse
        // when we need ro check for values, use l.equals method
        System.out.println(b.equals(c));
        // gave true becs it cares about only the valuea
        // internaklly its a byte array or char array
        // use charAt for strings

    }
}
