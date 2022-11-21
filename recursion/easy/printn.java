package recursion.easy;

public class printn {
    public static void main(String[] args) {
        
        printboth(5);
    }

    private static void printrev(int i) {
        if(i ==0){
            return;
        }
        // soprint(i);
        printrev(i-1);
        System.out.print(i+ " ");

    }
    private static void print(int i) {
        if(i ==0){
            return;
        }

        // soprint(i);
        System.out.print(i+ " ");
        print(i-1);

    }
    private static void printboth(int i) {
        if(i ==0){
            return;
        }

        // soprint(i);
       
        System.out.print(i+ " ");
        printboth(i-1);
        System.out.print(i+ " ");

    }
}
