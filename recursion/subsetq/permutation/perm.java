package recursion.subsetq.permutation;

import java.util.ArrayList;

public class perm {
    public static void main(String[] args) {
        perm("", "abc");

        System.out.println(permu("", "abcd"));
        System.out.println(permc("", "abc"));
    }

    private static void perm(String p, String up) {

        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {

            String l = p.substring(0, i);
            String r = p.substring(i, p.length());

            perm(l + ch + r, up.substring(1));

        }

    }

    private static ArrayList<String> permu(String p, String up) {

        if (up.isEmpty()) {
            ArrayList<String> ans = new ArrayList<>();
            // System.out.println(p);
            ans.add(p);

            return ans;
        }
        char ch = up.charAt(0);
        ArrayList<String> ansa = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {

            String l = p.substring(0, i);
            String r = p.substring(i, p.length());

            ansa.addAll(permu(l + ch + r, up.substring(1)));

        }
        return ansa;

    }

    private static int permc(String p, String up) {

        if (up.isEmpty()) {

            // System.out.println(p);
            return 1;

        }
        char ch = up.charAt(0);
        int count = 0;
        // ArrayList<String> ansa = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {

            String l = p.substring(0, i);
            String r = p.substring(i, p.length());

            count = count + (permc(l + ch + r, up.substring(1)));

        }
        return count;

    }

}
