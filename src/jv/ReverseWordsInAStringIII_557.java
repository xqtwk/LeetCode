package jv;

public class ReverseWordsInAStringIII_557 {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s);
        int left = 0;
        int right = 0;
        while (left < sb.length()) {
            while (left < right || left < sb.length() && sb.charAt(left) == ' ')
                ++left;
            while (right < left || right < sb.length() && sb.charAt(right) != ' ')
                ++right;
            reverse(sb, left, right - 1);
        }

        return sb.toString();
    }

    private void reverse(StringBuilder sb, int left, int right) {
        while (left < right) {
            final char temp = sb.charAt(left);
            sb.setCharAt(left++, sb.charAt(right));
            sb.setCharAt(right--, temp);
        }
    }
}
