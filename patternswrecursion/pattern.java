package patternswrecursion;

public class pattern {
    public static void main(String[] args) {
        // pattern(4,4);
        pattern1(4,4);

    }
    public static void pattern(int row, int col){
            if(row==0){
                return;
            }
            int f = col;
            System.out.println();
            if(row>0 && col>0){
                while(f>0){
                    System.out.print("*");
                    f--;
                }
            }
            pattern(--row,--col);
    }
    public static void pattern1(int row, int col){
            if(row==0){
                return;
            }
          if(row>col){
            System.out.println("*");
            pattern1(row,--col);
          }
          else{
            System.out.println();
            pattern1(--row,--col);
          }
    }
}
