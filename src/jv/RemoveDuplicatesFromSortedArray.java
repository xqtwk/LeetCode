package jv;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        List<Integer> uniques = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!uniques.contains(nums[i])) {
                uniques.add(nums[i]);
            }
            nums[i] = 0;
        }
        for (int i = 0; i < uniques.size(); i++) {
            nums[i] = uniques.get(i);
        }
        return uniques.size();
    }
    /* LIGHT
        public int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            }
            nums[count] = nums[i];
            count++;
        }
        return count;
    }
     */
}
