package jv;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class RemovingStarsFromAString {
    public static void main(String[] args) {

    }

    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        char[] array = s.toCharArray();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '*') {
                sb.append(s.charAt(i));
            } else if (!sb.isEmpty()) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return sb.toString();
    }
}
