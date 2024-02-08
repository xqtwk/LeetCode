package jv;

import java.util.Arrays;

public class ThreeSum_Closest {
    public static void main(String[] args) {
        ThreeSum_Closest threeSumClosest = new ThreeSum_Closest();
        int[] nums = new int[]{-1,2,1,-4};
        int target = 1;
        System.out.println(threeSumClosest.threeSumClosest(nums, target));
    }
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum = nums[0] + nums[1] + nums[2];
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length -1;
            System.out.print("right:" + nums[right] + " \n");
            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];
                int diff = currentSum - target;
                System.out.println(nums[left] + " " + nums[right] + " sum: " + currentSum);
                System.out.println("diff: " + diff);
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
