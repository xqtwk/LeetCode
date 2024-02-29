package jv;

import java.util.Arrays;

public class DistinctSubsequences {
    public int numDistinct(String s, String t) {
        int sLength = s.toCharArray().length;
        int tLength = t.toCharArray().length;
        int[][] dp = new int[sLength + 1][tLength + 1];
        for (int i = 0; i <= sLength; i++) {
            dp[i][0] = 1;
        }
        System.out.println(Arrays.deepToString(dp));
        for (int i = 1; i <= sLength; i++) {
            for (int j = 1; j <= tLength; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i-1][j-1] + dp[i- 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(dp));
        return dp[sLength][tLength];
    }
}
