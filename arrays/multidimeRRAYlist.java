import java.util.ArrayList;
import java.util.Scanner;

public class multidimeRRAYlist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

Scanner in = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            list.add(new ArrayList<>());

            
        }
        //add elements inside itl
        for (int i = 0; i < 3; i++) {

            list.get(i).add(in.nextInt());
            
        }
in.close();
    }
}
