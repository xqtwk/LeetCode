package jv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestDivisibleSubset {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 8};
        List<Integer> result = largestDivisibleSubset(nums);
        System.out.println(result);  // Output: [1, 2, 4, 8]
    }

    public static List<Integer> largestDivisibleSubset(int[] nums) {
        int length = nums.length;
        if (nums.length == 0) {
            return new ArrayList<>();
        }

        Arrays.sort(nums);

        int[] dp = new int[length];
        Arrays.fill(dp, 1);
        int maxIndex = 0;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }

            if (dp[maxIndex] < dp[i]) {
                maxIndex = i;
            }
        }
        int subsetSize = dp[maxIndex];

        List<Integer> result = new ArrayList<>();

        for (int i = maxIndex; subsetSize > 0; i--) {
            if (nums[maxIndex] % nums[i] == 0 && dp[i] == subsetSize) {
                result.add(nums[i]);
                maxIndex = i;
                subsetSize--;
            }
        }
        return result;
    }
}