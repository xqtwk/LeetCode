package jv;

import java.util.Arrays;

public class ThreeSum_Closest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum = Integer.MAX_VALUE / 2;
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length -1;
            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];
                int diff = currentSum - target;
                if (diff == 0) {
                    return currentSum;
                }
                if (diff < 0) {
                    left++;
                } else {
                    right--;
                }
                if (Math.abs(diff) < Math.abs(sum - target)) {
                    sum = currentSum;
                }
            }
        }
        return sum;
    }
}
