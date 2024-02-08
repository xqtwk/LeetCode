package jv;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] temp = new int[k];

        for (int i = 0; i < k; i++) {
            temp[i] = nums[nums.length - k + i];
        }
        for (int i = nums.length - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }
}
/*
public class RotateArray_189 {
    public void rotate(int[] nums, int k) {
        while (k > 0) {
            int temp = nums[nums.length-1];
            for (int i = nums.length-2; i >=0; i--) {
                nums[i+1] = nums[i];
            }
            nums[0] = temp;
            k--;
        }
    }
}
 */
