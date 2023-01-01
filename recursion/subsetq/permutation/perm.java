package recursion.subsetq.permutation;

public class perm {
    public static void main(String[] args) {
        perm("","abc");
    }

    private static void perm(String p, String up) {

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
       
        for(int i = 0; i <= p.length();i++){




            String l = p.substring(0,i);
            String r = p.substring(i, p.length());
         
            perm(l+ch+r, up.substring(1));



        }

    }
}
