package strings;

public class stringbuilderf {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+1);
            builder.append(ch);
        }
    }
}
