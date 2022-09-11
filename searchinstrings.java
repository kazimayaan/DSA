import java.util.Scanner;

public class searchinstrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = "kazim";
         char t = 'm';

         System.out.println(search(name,t));
         in.close();
    }

    private static boolean search(String name, char t) {
        if(name.length()==0){
            return false;
        }
        else{
            for (int i = 0; i < name.length(); i++) {
                if(name.charAt(i)==t){

                    return true;


                }
            }
        }
        return false;
    }

}
