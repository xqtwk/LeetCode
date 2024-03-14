package jv;

public class LongestSubarrayOf1sAfterDeletingOneElement {
    public static void main(String[] args) {

    }

    public int longestSubarray(int[] nums) {
        int result = 0;
        int zeroCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
                int currentLength = 0;
                for (int j = i - 1; j >= 0 && nums[j] == 1; j--) {
                    currentLength++;
                }

                for (int k = i + 1; k < nums.length && nums[k] == 1; k++) {
                    currentLength++;
                }

                result = Math.max(result, currentLength);
            }
        }
        if (zeroCount == 0) return nums.length - 1;
        else return result;
    }
}
