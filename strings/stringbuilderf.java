package strings;

public class stringbuilderf {
    public static void main(String[] args) {
        // stringbuilders are mutable
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch);
        }
        System.out.println(builder);
        // builde
        builder.reverse();
        System.out.println(builder);
    }
}
