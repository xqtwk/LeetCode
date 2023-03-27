package jv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber_17 {
    public static void main(String[] args) {
        LetterCombinationsOfAPhoneNumber_17 letterCombinationsOfAPhoneNumber_17 = new LetterCombinationsOfAPhoneNumber_17();
        System.out.println(letterCombinationsOfAPhoneNumber_17.letterCombinations("234"));
    }

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        String[] letters = {
                "0",
                "1",
                "abc",
                "def",
                "ghi",
                "jkl",
                "mno",
                "pqrs",
                "tuv",
                "wxyz"
        };
        ArrayList<String> combinations = new ArrayList<String>(Arrays.asList(""));
        for (int i = 0; i < digits.length(); i++) {
            ArrayList<String> newCombinations = new ArrayList<>();
            String letter = letters[digits.charAt(i) - '0'];
            System.out.println(combinations);
            for (String combination : combinations) {
                for (int j = 0; j < letter.length(); j++) {
                    System.out.println(combination);
                    newCombinations.add(combination + letter.charAt(j));
                }
            }
            combinations = newCombinations;
        }
        result.addAll(combinations);
        return result;
    }
}
