import java.util.Scanner;

public class lsearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();

        }

        System.out.println("enter the number to find in array");
        int sob = in.nextInt();
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (sob == arr[i]) {
                System.out.println("found element at " + i + "th position");
                flag = true;
            }
        }
        if (flag == false) {
            System.out.println("element npt found in array");
        }
        in.close();
    }
}
