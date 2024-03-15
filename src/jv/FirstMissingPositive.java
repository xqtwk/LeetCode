package jv;

import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{1, 2, 0}));
    }

    public static int firstMissingPositive(int[] nums) {
        int firstPositiveIndex = 0;
        Arrays.sort(nums);

        if (nums.length == 0 || nums[nums.length - 1] <= 0) {
            return 1;
        }

        while (firstPositiveIndex < nums.length && nums[firstPositiveIndex] <= 0) {
            firstPositiveIndex++;
        }

        if (firstPositiveIndex == nums.length || nums[firstPositiveIndex] != 1) {
            return 1;
        }

        for (int i = firstPositiveIndex; i < nums.length - 1; i++) {
            if (nums[i] + 1 < nums[i + 1]) {
                return nums[i] + 1;
            }
        }

        return nums[nums.length - 1] + 1;
    }
}
