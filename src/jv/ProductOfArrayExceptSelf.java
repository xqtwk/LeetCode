package jv;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {

    }

    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] answer = new int[length];
        Arrays.fill(answer, 1);
        int temp = 1;
        for (int i = 0; i < length; i++) {
            answer[i] *= temp;
            temp *= nums[i];
        }

        temp = 1;
        for (int i = length - 1; i >= 0; i--) {
            answer[i] *= temp;
            temp *= nums[i];
        }

        return answer;
    }
}
