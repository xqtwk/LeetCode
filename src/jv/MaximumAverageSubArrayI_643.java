package jv;

public class MaximumAverageSubArrayI_643 {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double result = sum;

        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            if (sum > result) {
                result = sum;
            }
        }
        return result / k;
    }
}
