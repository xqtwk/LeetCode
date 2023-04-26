package jv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LetterCasePermutation_784 {
    public List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        permutations(new StringBuilder(s), result, 0);
        return result;
    }

    private void permutations(StringBuilder s, List<String> result, int index) {
        if (index == s.length()) {
            result.add(s.toString());
            return;
        }
        char current = s.charAt(index);

        if (Character.isLetter(current)) {
            s.setCharAt(index, Character.toLowerCase(current));
            permutations(s, result, index + 1);
            s.setCharAt(index, Character.toUpperCase(current));
            permutations(s, result, index + 1);
        }

        else {
            permutations(s, result, index + 1);
        }

    }
}
