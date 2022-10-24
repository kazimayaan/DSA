package recursion;

// import javax.xml.transform.Source;

public class printhello {
    public static void main(String[] args) {
        hello(5);
    }

    private static void hello(int i) {
        System.out.println("hello world");
        for (int j = 1; j <=i; j++) {
            hello(j);
        }
    }
}
