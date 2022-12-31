package recursion.subsetq;

import java.util.ArrayList;
import java.util.List;

import javax.print.DocFlavor.STRING;

public class sub {
public static void main(String[] args) {
    // pattern of taking some elements and removeing some is known as subset pattern:
    subset("","abc");
    subset1("","abc");
    ArrayList<String> list = subseq("","abc");
    System.out.println(list);
    
}


private static ArrayList<String> subseq(String p, String up) {
    ArrayList<String> list = new ArrayList<>();
    if(up.isEmpty()){
       list.add(p);
        return list;
    }
    char ch = up.charAt(0);
    ArrayList<String> left = subseq(p+ch, up.substring(1));
    ArrayList<String> right =subseq(p, up.substring(1));
    left.addAll(right);
    return left;




}


private static void subset(String p, String up) {

    if(up.isEmpty()){
        System.out.println(p);
        return;
    }
    char ch = up.charAt(0);
    subset(p+ch, up.substring(1));
    subset(p, up.substring(1));



}
private static void subset1(String p, String up) {

    if(up.isEmpty()){
        System.out.println(p);
        return;
    }
    char ch = up.charAt(0);
    int a = ch;
    subset1(p+ch, up.substring(1));
    subset1(p+a, up.substring(1));
    subset1(p, up.substring(1));



}
}
