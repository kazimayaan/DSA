package recursion;

import java.util.ArrayList;
import java.util.List;

public class diceproblem {
    public static void main(String[] args) {
        dice("", 3);
        System.out.println(diceRET("", 4));
    }

    private static void dice(String p, int target) {
            if(target==0){
                
                
               System.out.println(p);
               return;
            }
            for(int i = 1; i <= 6 && i<= target; i++){
                dice(p+i , target-i);
            }
    }
    private static List<String> diceRET(String p, int target) {
        List<String> list = new ArrayList<>();
            if(target==0){

                list.add(p);
               return list ;
            }
            for(int i = 1; i <= 6 && i<= target; i++){
              list.addAll(diceRET(p+i , target-i));
            }
            return list;
    }
}
