package recursion;

// import javax.xml.transform.Source;
// thios is not recursion
// just to understand concepts of function calls
public class printhello {
    public static void main(String[] args) {
        hello(5);
    }

    private static void hello(int i) {
        System.out.println("hello world");
       hello1(i);
    }
    private static void hello1(int i) {
        System.out.println("hello world");
       hello2(i);
    }
    private static void hello2(int i) {
        System.out.println("hello world");
       
        hello3(i);
    }
    private static void hello3(int i) {
        System.out.println("hello world");
        hello4(i);
    }
    private static void hello4(int i) {
        System.out.println("hello world");
    
    }
}
