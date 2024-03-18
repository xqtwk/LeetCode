package jv;

public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {

    }

    public int longestOnes(int[] nums, int k) {
        int result = 0;
        int left = 0;
        int zeroCount = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount++;
            }

            while (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            result = Math.max(result, right - left + 1);
        }

        return result;
    }
}
