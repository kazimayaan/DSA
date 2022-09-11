import java.util.Scanner;

public class lsearchs{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();

        }

        System.out.println("enter the number to find in array");
        int sob = in.nextInt();
       int i = lsearch(arr,sob);
        i = i+1;
if(i>=0){
        System.out.println("found element at " + i + "th position");
}
else{
    System.out.println("Item not found");
}
        in.close();
    }

    private static int lsearch(int[] arr, int sob) {
        boolean flag = false;

        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (sob == arr[i]) {
           
                flag = true;
                return i;
            }
        }
        return -1;

    }
}
