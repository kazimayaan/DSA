package strings;

public class performanceofstrings {
    // important for string coding rounds

    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            System.out.println(ch);
            series = series + ch;
        }
        System.out.println(series);




        // probkem ad=nd wht its a bad soluttion
        // new object is being cteayed everytiume
        // in the above for loop
        // wastage of space happens
        // complexity is O(n2)
        // use StringbUILDER DATA TYPE OR CLASSS
        // AS THE SOLUTION
        

    }
}
