package recursion.easy;

public class printn {
    public static void main(String[] args) {
        print(10);
    }

    private static void print(int i) {
        if(i ==0){
            return;
        }
        // soprint(i);
        print(i-1);
        System.out.println(i);

    }
}
