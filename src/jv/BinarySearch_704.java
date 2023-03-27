package jv;

import java.util.Arrays;

public class BinarySearch_704 {
    public static void main(String[] args) {
        BinarySearch_704 binarySearch_704 = new BinarySearch_704();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        System.out.println(binarySearch_704.search(nums, 9));
    }

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
}
