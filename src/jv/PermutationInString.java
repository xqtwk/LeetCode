package jv;

import java.util.HashMap;

public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        HashMap<Character, Integer> subString = new HashMap<>();
        for (char c : s1.toCharArray()) {
            subString.put(c, subString.getOrDefault(c, 0) + 1);
        }

        HashMap<Character, Integer> string = new HashMap<>();
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            string.put(c, string.getOrDefault(c, 0) + 1);
            if (i >= s1.length()) {
                char prev = s2.charAt(i - s1.length());
                if (string.get(prev) == 1) {
                    string.remove(prev);
                } else {
                    string.put(prev, string.get(prev) - 1);
                }
            }
            if (i >= s1.length() - 1 && subString.equals(string)) {
                return true;
            }
        }

        return false;
    }
}
