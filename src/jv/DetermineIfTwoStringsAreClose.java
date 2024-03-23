package jv;

import java.util.HashMap;
import java.util.Map;

public class DetermineIfTwoStringsAreClose {
    public static void main(String[] args) {

    }

    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        Map<Character, Integer> count1 = new HashMap<>();
        Map<Character, Integer> count2 = new HashMap<>();

        for (char ch : word1.toCharArray()) {
            count1.put(ch, count1.getOrDefault(ch, 0) + 1);
        }
        for (char ch : word2.toCharArray()) {
            count2.put(ch, count2.getOrDefault(ch, 0) + 1);
        }

        if (!count1.keySet().equals(count2.keySet())) {
            return false;
        }

        int[] counts1 = count1.values().stream().mapToInt(Integer::intValue).sorted().toArray();
        int[] counts2 = count2.values().stream().mapToInt(Integer::intValue).sorted().toArray();

        for (int i = 0; i < counts1.length; i++) {
            if (counts1[i] != counts2[i])
                return false;
        }

        return true;
    }
}
