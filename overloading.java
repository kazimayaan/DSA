public class overloading {
    public static void main(String[] args) {
        fun(34,22);
        fun("kazim");
    }

    private static void fun(String string) {
        System.out.println("hello how are you "+ string);
    }

    private static void fun(int i, int j) {

        System.out.println("the numbers are "+ i + " and " +j);
    }
}
