package recursion;

public class numbersex {
    // write a function that takes in a number and prints it, 
    // print first five numbers
    // notice all are doin g same things
    // instead of creating new function
    
public static void main(String[] args) {
    print1(0);
}

private static void print1(int i) {
    System.out.println(i);
    
    
    print2(i+1);

}
private static void print2(int i) {
    System.out.println(i);
    
    
    print3(i+1);

}
private static void print3(int i) {
    System.out.println(i);
    
    
    print4(i+1);

}
private static void print4(int i) {
    System.out.println(i);
    
    
    print5(i+1);

}
private static void print5(int i) {
    System.out.println(i);
    
    
    

}
}

