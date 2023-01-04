package recursion;
public class kk{
    public static void main(String[] args) {
        String k = "";
        System.out.println(k);
        String[] strs = new String[2];
        strs[0] = "car";
        strs[1] = "cir";
        System.out.println(longestCommonPrefix(strs));

    }

        public static String longestCommonPrefix(String[] strs) {
    
            StringBuilder ans = new StringBuilder();
    
            if(strs.length==1){
                return strs[0];
            }
            
            String first = strs[0];
            if(first.length()==0){
                return first;
            }
            for(int i = 0; i < first.length(); i++){
                boolean flag = false;
                int k = 0;
                char c = first.charAt(i);
                while(k<strs.length){
                    if(flag==true){
                        break;
                    }
                   String current = strs[k];
                   int n = current.length();
                   if(i<n){
    
                   
                   if(c==current.charAt(i)){
                       
                       if(k==strs.length-1){
      ans.append(c);
                       }
                     
                   }
                   else{
                    flag = true;
                    break;
                }
                   }
                   else{
                       flag = true;
                       break;
                   }
    
                   k++;
                }
                if(flag==true){
                    break;
                }
            }
            return ans.toString();
            
        }
    }
