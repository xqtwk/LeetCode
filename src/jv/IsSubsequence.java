package jv;

public class IsSubsequence {
    public static void main(String[] args) {

    }

    public boolean isSubsequence(String s, String t) {
        int sub = 0;
        int seq = 0;
        while (sub < s.length() && seq < t.length()) {
            if (s.charAt(sub) == t.charAt(seq)) {
                sub++;
            }
            seq++;
        }
        return sub == s.length();
    }
}
