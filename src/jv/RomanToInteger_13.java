package jv;

import java.util.HashMap;

public class RomanToInteger_13 {
    public int romanToInt(String s) {
        int result = 0;
        if (s.length() == 0) {
            return result;
        }
        HashMap<Character, Integer> chars = new HashMap<>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1  && ((s.charAt(i) == 'I' && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) ||
                    (s.charAt(i) == 'X' && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) ||
                    (s.charAt(i) == 'C' && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')))
            ) {
                result += (chars.get(s.charAt(i + 1)) - chars.get(s.charAt(i)));
                i++;
            } else {
                result += chars.get(s.charAt(i));
            }
        }
        return result;
    }
}
