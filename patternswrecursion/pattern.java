package patternswrecursion;

public class pattern {
    public static void main(String[] args) {
        pattern(4,4);
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
}
