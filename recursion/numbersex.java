package recursion;

public class numbersex {
    // write a function that takes in a number and prints it, 
    // print first five numbers
public static void main(String[] args) {
    print1(1);
}

private static void print1(int i) {
    System.out.println(i);
    if(i< 5){
        i++;
        print1(i);
    }
    
    

}
}

