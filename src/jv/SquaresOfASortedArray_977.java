package jv;

import java.util.Arrays;

public class SquaresOfASortedArray_977 {
    public int[] sortedSquares(int[] nums) {
        int first = nums[0];
        for (int i =0; i < nums.length;i++) {
            nums[i] = nums[i] * nums[i];
        }
        if (first < 0) {
            Arrays.sort(nums);
        }
        // System.gc(); // mostly bad practice
        return nums;
    }
}
