package recursion;

public class lcode {
    public static void main(String[] args) {
    //    print(3) ;
    int k = countOperations(2,3);
    System.out.println(k);
    int kz  = 3; 
    int gk = k-20;
    System.out.println(gk);
    System.out.println(kz);

    }
  
   
        public static int countOperations(int num1, int num2) {
            int res = count(num1,num2,0);
            return res;
            
            }
        
        public static int count(int num1, int num2, int count){
    
            if(num1==0 || num2==0){
                return count;
            }
            if(num1==num2){
                return count+1;
            }
            if(num1<num2){
                count++;
                num2 = num2-num1;
               return count(num1,num2,count);
            }
            else{
                count++;
                num1 = num1-num2;
              return  count(num1,num2,count);
        }
    }
    private static void prinet(int i) {
        if(i == 500){
            System.out.print(i);
            return;
        }
            System.out.print(i+ " ");
            prinet(i+1);
            // need base condition 
            // infinite erecu is stack overflow
            // lol
            // we need base condition, body and recursive calls
        


    }
    private static void print(int i) {


 
System.out.println(i);
i++;
        if(i < 6){
            print(i);
        }
        else{
            return;
        }
    }
}
