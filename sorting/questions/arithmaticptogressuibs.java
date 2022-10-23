package sorting.questions;

public class arithmaticptogressuibs {
    public static void main(String[] args) {
        int[] arr = {1,5,3};
        System.out.println(canMakeArithmeticProgression(arr));
    }
    
    
    public static boolean canMakeArithmeticProgression(int[] arr) {
        Boolean swapped=false;
        for(int i = 0; i < arr.length; i++){
            swapped = false;
            for(int j = 1; j < arr.length -i; j++){
                if(arr[j]<arr[j-1]){
                    swapped = true;
                    int temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]=temp;
                }
                if(swapped==false){
                    break;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            
        }
        
        int diff = arr[1]-arr[0]; 
        for(int k = 0; k < arr.length-1 ; k++){
            if(arr[k+1]-arr[k]!=diff){
                return false;
            }
            
        }
        return true;
    }

}
