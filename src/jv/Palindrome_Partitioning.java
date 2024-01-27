package jv;

import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partitioning {

    public List<List<String>> partition(String s) {
        int sLength = s.length();
        boolean[][] isPalindromeArray = new boolean[sLength][sLength];
        List<List<List<String>>> result = new ArrayList<>();

        for (int i = 0; i < sLength; i++) {
            result.add(new ArrayList<>());
        }

        for (int right = 0; right < sLength; right++) {
            for (int left = 0; left <= right; left++) {
                if (s.charAt(left) == s.charAt(right) && (right - left <= 2 || isPalindromeArray[left + 1][right - 1])) {
                    isPalindromeArray[left][right] = true;
                    String string = s.substring(left, right + 1);

                    if (left == 0) {
                        result.get(right).add(List.of(string));
                    } else {
                        for (List<String> r : result.get(left - 1)) {
                            List<String> newList = new ArrayList<>(r);
                            newList.add(string);
                            result.get(right).add(newList);
                        }
                    }

                }
            }
        }

        return result.get(sLength - 1);
    }

    public static void main(String[] args) {
        Palindrome_Partitioning solution = new Palindrome_Partitioning();
        String s = "aab";
        List<List<String>> partitions = solution.partition(s);
        for (List<String> partition : partitions) {
            System.out.println(partition);
        }
    }
}
