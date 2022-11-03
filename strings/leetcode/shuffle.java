package strings.leetcode;

import java.util.Arrays;

public class shuffle {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = { 4, 5, 6, 7, 0, 2, 1, 3 };
        String res = restoreString(s, indices);
        System.out.println(res);
    }

    public static String restoreString(String s, int[] indices) {
        StringBuilder res = new StringBuilder();
        res.setLength(indices.length);
        int i = 0;
        while (i < indices.length) {
            char f = s.charAt(i);
            int index = indices[i];
            res.insert(index, f);
            i++;
        }
        return res.toString();
    }
}
