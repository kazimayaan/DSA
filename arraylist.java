// import java.rmi.server.SocketSecurityException;
import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> kazim = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        // kazim.add(444);
        // kazim.add(444);
        // kazim.add(444);
        // kazim.add(444);
        // kazim.add(444);
        // kazim.add(444);
        // kazim.add(444);
        for (int i = 0; i < 10; i++) {
            int e = in.nextInt();
            kazim.add(e);
        }
        for (int i = 0; i <10; i++) {
            // SocketSecurityException
            System.out.println(kazim.get(i));
        }
        // System.out.println(kazim.addAll(kazim));

in.close();
    }
}
