package patterns;

public class practpat {
    public static void main(String[] args) {
        patterna(5);
    }

    private static void patterna(int n) {
        for(int row = 1; row <=n ; row++){

            for (int i = 1; i <= n-row; i++) {
                
                System.out.print(" ");
            }
            for (int j = 1; j <= row; j++) {

                System.out.print("* ");
                
            }
            System.out.println();
        }
    }

}
