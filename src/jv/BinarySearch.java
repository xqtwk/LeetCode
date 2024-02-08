package jv;

public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch binarySearch_ = new BinarySearch();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        System.out.println(binarySearch_.search(nums, 9));
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
