package patterns;

public class pattern10 {
    public static void main(String[] args) {
        // pattern(4);
        pattern31(4);
    }
  static void  pattern(int n ){
int digit =2 * n-1;
            for (int i = 1; i <= 2*n -1; i++) {

                for (int j = 0; j < 2*n -1; j++) {
                    int left = j;
                    int right = digit - j;
                    int top = i;
                    int down = digit - i;
                  int cc= n -  Math.min(Math.min(top, down),Math.min(left, right));

                    System.out.print(cc  + " ");
                }
                
                System.out.println();
            }

    }
    static void pattern31(int n) {
        int originalN = n;
        n = 2 * n-1;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
