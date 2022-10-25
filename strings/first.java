package strings;

public class first {
    // String si most commonly used class in java
    // every string we create is an objecy, the name is referenve variable
    // referenve points point to some object always.
    // internally :_
    // string pool : inyernallu yhe string its a seperate memory structure for
    // stringsiin heap memory
    // string pool is making memory more optimised
    // strings are immutable
    // immutablility : cannot change the object, but we can create new ones\
    // immutablility for security reasons
        public static void main(String[] args) {
        String kazim = "KAZIM";
        System.out.println(kazim);
        String name = "kazim Ayaan P S";
        System.out.println(name);
        name = "kazim";
        System.out.println(name);
        // here we are not changing the Kazim Ayaan P S object, java just created a new
        // object of kazim
        // the old object goes into garbage collection

    }
}
