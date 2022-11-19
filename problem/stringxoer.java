package problem;

public class stringxoer {
    public static void main(String[] args) {
     String str = "ab";
     String strs = "ba";

     int res = str.charAt(0) ^ strs.charAt(1);
        System.out.println(isAnagram(str, strs));


    //  System.out.println(res);


     
    }
    public static boolean isAnagram(String s, String t) {
        int op =0;
        if(s.length()!=t.length()){
            return false;
        }
       for(int i = 0; i< s.length(); i++){
           op = s.charAt(i) ^ t.charAt(i);
           
       }
        if(op==0){
            return true;
        }
        return false;
    }
}
