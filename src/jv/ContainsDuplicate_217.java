package jv;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate_217 {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length == 1) return false;

        Set s = new HashSet(nums.length);

        for (int i : nums) {
            if (!s.add(i)) {
                return true;
            }
        }
        return false;
    }
}
