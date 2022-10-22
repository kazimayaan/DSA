package strings;

public class palindrome {
    public static void main(String[] args) {
        String pali = "AaaaA";
        Boolean sol = palindrome(pali);
        // pali.replac
        
        System.out.println(sol);
    }

    private static Boolean palindrome(String pali) {
        // StringBuilder sb = new StringBuilder();
        // for (int i = 0; i < pali.length(); i++) {
        //     sb = sb + pali.charAt(i);
        // }
        // StringBuilder check = new StringBuilder();
        // check = sb.reverse();
        // if(check.equals(sb)){
        //     return true;
        // }
        // else{
        //     return false;
        // }
        // return false;
        int s = 0;
         int e = pali.length()-1;
         if(pali==null || pali.length()==0){
            return true;
         }
            while(s<=e){
                if(pali.charAt(s)==pali.charAt(e)){
                    s++;
                    e--;
                }
                else{
                    return false;
                }
            }
            return true;
    }
    public int maxRepeating(String sequence, String word) {
        int c=0;
        String add=word;
        while(sequence.contains(word)==true)
        {
            c+=1;
            word=word+add;
            //System.out.println(word);
        }
        return c;
    }
}
