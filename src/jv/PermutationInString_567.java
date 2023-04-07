package jv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PermutationInString_567 {
    public boolean checkInclusion(String s1, String s2) {
        char[] chars = s1.toCharArray();
        ArrayList<String> array = new ArrayList<>();
        int n = chars.length;

        for (int i = 0; i < Math.pow(2, n); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                int bit = (i / (int) Math.pow(2, j)) % 2;
                if (bit == 1) {
                    sb.append(chars[j]);
                }
            }
            array.add(sb.toString());
        }
        for (String key: array) {
            if (s2.contains(key)) {
                return true;
            }
        }
        return false;
    }
}
