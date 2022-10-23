import java.util.Scanner;
public class maxiteminrange {


    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner in = new Scanner(System.in);

            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
                
            }
            System.out.println("enter the start range");
            int x = in.nextInt();
            System.out.println("enter the end range");
            int y= in.nextInt();

            int max= 0;
            for (int i = x; i <= y; i++) {
                if(max<arr[i]){
                    max= arr[i];
                }
            }
            System.out.println("the maximum of array is " + max);
            in.close();
}

}
