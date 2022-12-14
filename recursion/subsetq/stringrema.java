package recursion.subsetq;

public class stringrema {
    public static void main(String[] args) {
        skipa("", "baccad");
        String res = skipr("","kazim ayaan");
        System.out.println(res);

    }
    public static void skipa(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        if(up.charAt(0)=='a'){
            skipa(p,up.substring(1));
        }else{
            skipa(p+up.charAt(0),up.substring(1));
        }
    }
    public static String skipr(String p, String up){
        if(up.isEmpty()){
        
            return p;
        }
        if(up.charAt(0)=='a'){
         return   skipr(p,up.substring(1));
        }else{
           return skipr(p+up.charAt(0),up.substring(1));
        }
    }
}
