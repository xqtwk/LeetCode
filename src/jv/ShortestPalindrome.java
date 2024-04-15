package jv;


public class ShortestPalindrome {
    public static void main(String[] args) {

    }

    public String shortestPalindrome(String s) {
        int left, right = s.length();
        StringBuilder stringBuilder = new StringBuilder();

        while (true) {
            left = 0;
            for (int i = right - 1; i >= 0; i--) {
                if (s.charAt(i) == s.charAt(left)) {
                    left++;
                }
            }
            if (left == right) {
                break;
            }
            right = left;
        }
        stringBuilder.append(s.substring(right)).reverse().append(s);
        return stringBuilder.toString();
    }
}
